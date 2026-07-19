/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends vg {
    private int field_f;
    private int field_h;
    private int field_g;

    vl(int param0, fsa param1) {
        dt discarded$0 = null;
        try {
            this.field_f = param0;
            this.field_g = param1.f((byte) -72).c(121);
            this.field_h = param1.n(31974).field_d;
            discarded$0 = param1.x(15470);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        return "PlayerItem(" + this.field_f + "," + this.field_g + "," + this.field_h + ")";
    }

    final static iu[] a(byte param0, int param1, int param2, int param3) {
        iu[] discarded$1 = null;
        iu[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        iu[] var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = new iu[9];
        var4 = var7;
        var7[0] = jf.a(param1, 121, param3);
        if (param0 > 111) {
          var5 = 1;
          L0: while (true) {
            if ((var5 ^ -1) > -10) {
              var7[var5] = var7[0];
              var5++;
              if (var6 == 0) {
                continue L0;
              } else {
                return var4;
              }
            } else {
              var7[4] = jf.a(param2, 43, 64);
              return var4;
            }
          }
        } else {
          discarded$1 = vl.a((byte) 34, 94, 33, 36);
          var5 = 1;
          L1: while (true) {
            if ((var5 ^ -1) > -10) {
              var7[var5] = var7[0];
              var5++;
              if (var6 == 0) {
                continue L1;
              } else {
                return var4;
              }
            } else {
              var7[4] = jf.a(param2, 43, 64);
              return var4;
            }
          }
        }
    }

    static {
    }
}
