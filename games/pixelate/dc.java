/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static byte[] field_b;
    static ak field_a;

    final static void a(byte param0, java.awt.Frame param1, cb param2) {
        ei var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 == -124) {
          L0: while (true) {
            var3 = param2.a(param1, -84);
            L1: while (true) {
              if (-1 != (var3.field_b ^ -1)) {
                if (var3.field_b == 1) {
                  param1.setVisible(false);
                  param1.dispose();
                  return;
                } else {
                  vg.a(100L, (byte) 23);
                  continue L0;
                }
              } else {
                vg.a(10L, (byte) 23);
                continue L1;
              }
            }
          }
        } else {
          var5 = null;
          dc.a((byte) 3, (java.awt.Frame) null, (cb) null);
          L2: while (true) {
            var3 = param2.a(param1, -84);
            L3: while (true) {
              if (-1 != (var3.field_b ^ -1)) {
                if (var3.field_b == 1) {
                  param1.setVisible(false);
                  param1.dispose();
                  return;
                } else {
                  vg.a(100L, (byte) 23);
                  continue L2;
                }
              } else {
                vg.a(10L, (byte) 23);
                continue L3;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 == -1) {
            return;
        }
        field_a = null;
    }

    static {
    }
}
