/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv {
    static dja field_d;
    private asb field_e;
    private asb field_a;
    private pfb field_c;
    static int field_b;
    static String field_f;

    final rn a(byte param0, int param1) {
        rn var3 = null;
        byte[] var4 = null;
        rn var5 = null;
        var3 = (rn) ((jv) this).field_c.b(0, (long)param1);
        if (var3 == null) {
          if (param0 == -72) {
            L0: {
              if (param1 < 32768) {
                var4 = ((jv) this).field_a.a(0, param1, (byte) 13);
                break L0;
              } else {
                var4 = ((jv) this).field_e.a(0, 32767 & param1, (byte) 13);
                break L0;
              }
            }
            var5 = new rn();
            if (var4 == null) {
              if (32768 <= param1) {
                var5.a(0);
                ((jv) this).field_c.a((Object) (Object) var5, (long)param1, (byte) -117);
                return var5;
              } else {
                ((jv) this).field_c.a((Object) (Object) var5, (long)param1, (byte) -117);
                return var5;
              }
            } else {
              var5.a(new ds(var4), param0 + 8524);
              if (32768 > param1) {
                ((jv) this).field_c.a((Object) (Object) var5, (long)param1, (byte) -117);
                return var5;
              } else {
                var5.a(0);
                ((jv) this).field_c.a((Object) (Object) var5, (long)param1, (byte) -117);
                return var5;
              }
            }
          } else {
            return null;
          }
        } else {
          return var3;
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (!(dma.field_g < param3 + param1)) {
            return param1;
        }
        if (param0 != -109) {
            jv.a((byte) 16);
            if (!(0 > param2 + param1 - param3)) {
                return param2 + (param1 - param3);
            }
            return -param3 + dma.field_g;
        }
        if (!(0 > param2 + param1 - param3)) {
            return param2 + (param1 - param3);
        }
        return -param3 + dma.field_g;
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 != -33) {
            field_b = -56;
        }
    }

    jv(int param0, asb param1, asb param2) {
        ((jv) this).field_c = new pfb(64);
        ((jv) this).field_a = param1;
        ((jv) this).field_e = param2;
        if (((jv) this).field_a != null) {
            int discarded$0 = ((jv) this).field_a.b(0, -6942);
        }
        if (null != ((jv) this).field_e) {
            int discarded$1 = ((jv) this).field_e.b(0, -6942);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = (dja) (Object) new efb();
        field_f = "Updates will sent to the email address you've given";
    }
}
