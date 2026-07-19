/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    private la field_d;
    private la field_e;
    static String field_b;
    private al field_c;
    static co field_a;

    final static void b(int param0) {
        ah.field_c = sa.a((byte) 35);
        dc.field_a = new ln();
        ea.a(true, (byte) 126, true);
        if (param0 != 1) {
            gh.b(-55);
        }
    }

    final p a(int param0, int param1) {
        p var3 = null;
        byte[] var4 = null;
        p var7 = null;
        var3 = (p) (this.field_c.a(param1 + -32891, (long)param0));
        if (param1 == 32767) {
          if (var3 == null) {
            L0: {
              if ((param0 ^ -1) <= -32769) {
                var4 = this.field_e.a(1, 100, param0 & 32767);
                break L0;
              } else {
                var4 = this.field_d.a(1, 100, param0);
                break L0;
              }
            }
            var7 = new p();
            if (var4 == null) {
              if (32768 <= param0) {
                var7.d((byte) -91);
                this.field_c.a((long)param0, var7, (byte) 116);
                return var7;
              } else {
                this.field_c.a((long)param0, var7, (byte) 116);
                return var7;
              }
            } else {
              var7.a(new fj(var4), (byte) 38);
              if (32768 <= param0) {
                var7.d((byte) -91);
                this.field_c.a((long)param0, var7, (byte) 116);
                return var7;
              } else {
                this.field_c.a((long)param0, var7, (byte) 116);
                return var7;
              }
            }
          } else {
            return var3;
          }
        } else {
          this.field_e = (la) null;
          if (var3 == null) {
            L1: {
              if ((param0 ^ -1) <= -32769) {
                var4 = this.field_e.a(1, 100, param0 & 32767);
                break L1;
              } else {
                var4 = this.field_d.a(1, 100, param0);
                break L1;
              }
            }
            var3 = new p();
            if (var4 != null) {
              var3.a(new fj(var4), (byte) 38);
              if (32768 > param0) {
                this.field_c.a((long)param0, var3, (byte) 116);
                return var3;
              } else {
                var3.d((byte) -91);
                this.field_c.a((long)param0, var3, (byte) 116);
                return var3;
              }
            } else {
              if (32768 <= param0) {
                var3.d((byte) -91);
                this.field_c.a((long)param0, var3, (byte) 116);
                return var3;
              } else {
                this.field_c.a((long)param0, var3, (byte) 116);
                return var3;
              }
            }
          } else {
            return var3;
          }
        }
    }

    private gh() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        if (param0 <= 104) {
            gh.b(29);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
