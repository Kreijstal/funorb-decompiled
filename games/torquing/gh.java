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
        byte[] var4 = null;
        p var3 = (p) (this.field_c.a(param1 - 32891, (long)param0));
        byte[] var4Lifetime1;
        if (param1 != 32767) {
          this.field_e = (la) null;
          if (var3 != null) {
            return var3;
          }
          if (param0 < 32768) {
            var4 = this.field_d.a(1, 100, param0);
          } else {
            var4 = this.field_e.a(1, 100, param0 & 32767);
          }
          var3 = new p();
          if (var4 == null) {
            if (32768 > param0) {
              this.field_c.a((long)param0, var3, (byte) 116);
              return var3;
            }
            var3.d((byte) -91);
            this.field_c.a((long)param0, var3, (byte) 116);
            return var3;
          }
          var3.a(new fj(var4), (byte) 38);
          if (32768 <= param0) {
            var3.d((byte) -91);
            this.field_c.a((long)param0, var3, (byte) 116);
            return var3;
          }
          this.field_c.a((long)param0, var3, (byte) 116);
          return var3;
        }
        if (var3 != null) {
          return var3;
        }
        if (param0 < 32768) {
          var4Lifetime1 = this.field_d.a(1, 100, param0);
        } else {
          var4Lifetime1 = this.field_e.a(1, 100, param0 & 32767);
        }
        p var7 = new p();
        if (var4Lifetime1 != null) {
          var7.a(new fj(var4Lifetime1), (byte) 38);
          if (32768 > param0) {
            this.field_c.a((long)param0, var7, (byte) 116);
            return var7;
          }
          var7.d((byte) -91);
          this.field_c.a((long)param0, var7, (byte) 116);
          return var7;
        }
        if (32768 > param0) {
          this.field_c.a((long)param0, var7, (byte) 116);
          return var7;
        }
        var7.d((byte) -91);
        this.field_c.a((long)param0, var7, (byte) 116);
        return var7;
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
