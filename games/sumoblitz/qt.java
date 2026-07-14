/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qt {
    private boolean field_b;
    int field_a;

    final static void b(boolean param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0) {
            nk.b();
            break L0;
          } else {
            lj discarded$3 = qt.a((byte) -32);
            break L0;
          }
        }
        nk.b();
        nk.b();
        sq.field_a = new int[260];
        jn.field_b = 11;
        var1 = 0;
        L1: while (true) {
          if (-257 >= (var1 ^ -1)) {
            var5 = 256;
            var1 = var5;
            L2: while (true) {
              if (var5 < sq.field_a.length) {
                sq.field_a[var5] = 255;
                var5++;
                continue L2;
              } else {
                return;
              }
            }
          } else {
            var2 = 15.0;
            sq.field_a[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
            var1++;
            continue L1;
          }
        }
    }

    final static lj a(byte param0) {
        if (param0 != 21) {
            return null;
        }
        String var1 = gi.c((byte) -2);
        if (var1 != null) {
            if (var1.indexOf('@') >= 0) {
                var1 = "";
            }
        }
        return new lj(gi.c((byte) -2), kc.a(param0 + -3));
    }

    final void b(byte param0) {
        if (param0 > -126) {
            ((qt) this).field_b = true;
            ((qt) this).field_b = false;
            return;
        }
        ((qt) this).field_b = false;
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return ((qt) this).field_b;
    }

    final void a(int param0) {
        if (param0 != 5295) {
            qt.b(false);
            ((qt) this).field_b = true;
            return;
        }
        ((qt) this).field_b = true;
    }

    qt() {
        ((qt) this).field_a = -1;
    }

    static {
    }
}
