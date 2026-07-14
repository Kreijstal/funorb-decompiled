/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class voa {
    static int field_d;
    static int field_b;
    private pfb field_c;
    private asb field_e;
    private asb field_a;

    final pi a(int param0, int param1) {
        pi var3 = null;
        byte[] var4 = null;
        pi var5 = null;
        pi var6 = null;
        var3 = (pi) ((voa) this).field_c.b(0, (long)param0);
        if (var3 == null) {
          if (param1 < -99) {
            L0: {
              if (32768 > param0) {
                var4 = ((voa) this).field_a.a(1, param0, (byte) 13);
                break L0;
              } else {
                var4 = ((voa) this).field_e.a(1, param0 & 32767, (byte) 13);
                break L0;
              }
            }
            var6 = new pi();
            if (var4 != null) {
              L1: {
                var6.a(new ds(var4), -1);
                if ((param0 ^ -1) <= -32769) {
                  var6.e((byte) 97);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((voa) this).field_c.a((Object) (Object) var6, (long)param0, (byte) -117);
              return var6;
            } else {
              L2: {
                if ((param0 ^ -1) <= -32769) {
                  var6.e((byte) 97);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((voa) this).field_c.a((Object) (Object) var6, (long)param0, (byte) -117);
              return var6;
            }
          } else {
            L3: {
              ((voa) this).field_c = null;
              if (32768 > param0) {
                var4 = ((voa) this).field_a.a(1, param0, (byte) 13);
                break L3;
              } else {
                var4 = ((voa) this).field_e.a(1, param0 & 32767, (byte) 13);
                break L3;
              }
            }
            var5 = new pi();
            if (var4 == null) {
              L4: {
                if ((param0 ^ -1) <= -32769) {
                  var5.e((byte) 97);
                  break L4;
                } else {
                  break L4;
                }
              }
              ((voa) this).field_c.a((Object) (Object) var5, (long)param0, (byte) -117);
              return var5;
            } else {
              L5: {
                var5.a(new ds(var4), -1);
                if ((param0 ^ -1) <= -32769) {
                  var5.e((byte) 97);
                  break L5;
                } else {
                  break L5;
                }
              }
              ((voa) this).field_c.a((Object) (Object) var5, (long)param0, (byte) -117);
              return var5;
            }
          }
        } else {
          return var3;
        }
    }

    voa(int param0, asb param1, asb param2, rs param3) {
        ((voa) this).field_c = new pfb(64);
        ((voa) this).field_a = param1;
        ((voa) this).field_e = param2;
        if (((voa) this).field_a != null) {
            int discarded$0 = ((voa) this).field_a.b(1, -6942);
        }
        if (null != ((voa) this).field_e) {
            int discarded$1 = ((voa) this).field_e.b(1, -6942);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 1280;
        field_d = 0;
    }
}
