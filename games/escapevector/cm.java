/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends oa {
    int field_z;
    byte[] field_y;
    jg field_x;

    final int g(int param0) {
        if (((cm) this).field_u) {
            return 0;
        }
        if (param0 != 100) {
            ((cm) this).field_z = 124;
            return 100;
        }
        return 100;
    }

    final static void a(java.applet.Applet param0, int param1) {
        va.a("", -121, param0);
        de.a(false, param0);
        if (param1 != 21027) {
            Object var3 = null;
            cm.a((java.applet.Applet) null, 73);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = EscapeVector.field_A;
        if (param2 != 96) {
          var5 = null;
          cm.a((java.applet.Applet) null, 108);
          var3 = 0;
          L0: while (true) {
            if (param1 <= 0) {
              return var3;
            } else {
              var3 = var3 << 1837538433 | param0 & 1;
              param1--;
              param0 = param0 >>> 1;
              continue L0;
            }
          }
        } else {
          var3 = 0;
          L1: while (true) {
            if (param1 <= 0) {
              return var3;
            } else {
              var3 = var3 << 1837538433 | param0 & 1;
              param1--;
              param0 = param0 >>> 1;
              continue L1;
            }
          }
        }
    }

    cm() {
    }

    final byte[] a(boolean param0) {
        if (!param0) {
            int discarded$8 = ((cm) this).g(81);
            if (!(!((cm) this).field_u)) {
                throw new RuntimeException();
            }
            return ((cm) this).field_y;
        }
        if (!(!((cm) this).field_u)) {
            throw new RuntimeException();
        }
        return ((cm) this).field_y;
    }

    static {
    }
}
