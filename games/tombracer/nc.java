/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static nh field_e;
    private cn field_a;
    private dd field_c;
    private cn field_d;
    static int[] field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 44) {
            nc.a(-93);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final br a(byte param0, int param1) {
        br var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        br var6 = null;
        var3 = (br) ((nc) this).field_c.a((byte) 114, (long)param1);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if ((param1 ^ -1) > -32769) {
              var4 = ((nc) this).field_a.a(false, 0, param1);
              break L0;
            } else {
              var4 = ((nc) this).field_d.a(false, 0, 32767 & param1);
              break L0;
            }
          }
          var6 = new br();
          if (var4 != null) {
            L1: {
              var6.a(new uia(var4), -26706);
              if ((param1 ^ -1) <= -32769) {
                var6.a(10211);
                break L1;
              } else {
                break L1;
              }
            }
            var5 = -55 / ((param0 - -25) / 35);
            ((nc) this).field_c.a(29166, (Object) (Object) var6, (long)param1);
            return var6;
          } else {
            L2: {
              if ((param1 ^ -1) <= -32769) {
                var6.a(10211);
                break L2;
              } else {
                break L2;
              }
            }
            var5 = -55 / ((param0 - -25) / 35);
            ((nc) this).field_c.a(29166, (Object) (Object) var6, (long)param1);
            return var6;
          }
        }
    }

    nc(int param0, cn param1, cn param2) {
        ((nc) this).field_c = new dd(64);
        ((nc) this).field_a = param1;
        ((nc) this).field_d = param2;
        if (((nc) this).field_a != null) {
            int discarded$0 = ((nc) this).field_a.a((byte) -88, 0);
        }
        if (null != ((nc) this).field_d) {
            int discarded$1 = ((nc) this).field_d.a((byte) -91, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
    }
}
