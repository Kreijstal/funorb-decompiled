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
        int discarded$0 = 35;
        ah.field_c = sa.a();
        dc.field_a = new ln();
        ea.a(true, (byte) 126, true);
        if (param0 != 1) {
            gh.b(-55);
        }
    }

    final p a(int param0, int param1) {
        p var3 = null;
        byte[] var4 = null;
        p var5 = null;
        p var10 = null;
        var3 = (p) ((gh) this).field_c.a(param1 + -32891, (long)param0);
        if (param1 == 32767) {
          if (var3 == null) {
            L0: {
              if (param0 >= 32768) {
                var4 = ((gh) this).field_e.a(1, 100, param0 & 32767);
                break L0;
              } else {
                var4 = ((gh) this).field_d.a(1, 100, param0);
                break L0;
              }
            }
            var10 = new p();
            if (var4 == null) {
              if (32768 <= param0) {
                var10.d((byte) -91);
                ((gh) this).field_c.a((long)param0, (Object) (Object) var10, (byte) 116);
                return var10;
              } else {
                ((gh) this).field_c.a((long)param0, (Object) (Object) var10, (byte) 116);
                return var10;
              }
            } else {
              var10.a(new fj(var4), (byte) 38);
              if (32768 <= param0) {
                var10.d((byte) -91);
                ((gh) this).field_c.a((long)param0, (Object) (Object) var10, (byte) 116);
                return var10;
              } else {
                ((gh) this).field_c.a((long)param0, (Object) (Object) var10, (byte) 116);
                return var10;
              }
            }
          } else {
            return var3;
          }
        } else {
          ((gh) this).field_e = null;
          if (var3 == null) {
            L1: {
              if (param0 >= 32768) {
                var4 = ((gh) this).field_e.a(1, 100, param0 & 32767);
                break L1;
              } else {
                var4 = ((gh) this).field_d.a(1, 100, param0);
                break L1;
              }
            }
            var5 = new p();
            var3 = var5;
            if (var4 != null) {
              var3.a(new fj(var4), (byte) 38);
              if (32768 > param0) {
                ((gh) this).field_c.a((long)param0, (Object) (Object) var5, (byte) 116);
                return var3;
              } else {
                var5.d((byte) -91);
                ((gh) this).field_c.a((long)param0, (Object) (Object) var5, (byte) 116);
                return var3;
              }
            } else {
              if (32768 <= param0) {
                var5.d((byte) -91);
                ((gh) this).field_c.a((long)param0, (Object) (Object) var5, (byte) 116);
                return var5;
              } else {
                ((gh) this).field_c.a((long)param0, (Object) (Object) var5, (byte) 116);
                return var5;
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

    public static void a() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
