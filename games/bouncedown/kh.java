/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    private od field_a;
    private gk field_c;
    private gk field_b;

    final ne a(int param0, byte param1) {
        ne var3 = null;
        byte[] var4 = null;
        var3 = (ne) ((kh) this).field_a.a((long)param0, 1872);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if ((param0 ^ -1) > -32769) {
              var4 = ((kh) this).field_b.b(114, param0, 1);
              break L0;
            } else {
              var4 = ((kh) this).field_c.b(92, 32767 & param0, 1);
              break L0;
            }
          }
          var3 = new ne();
          if (param1 <= -88) {
            L1: {
              if (var4 != null) {
                var3.a(-124, new wi(var4));
                break L1;
              } else {
                break L1;
              }
            }
            if (32768 <= param0) {
              var3.d(31680);
              ((kh) this).field_a.a((Object) (Object) var3, (long)param0, 1);
              return var3;
            } else {
              ((kh) this).field_a.a((Object) (Object) var3, (long)param0, 1);
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    private kh() throws Throwable {
        throw new Error();
    }

    final static boolean a(si param0, int param1) {
        if (param1 != 30256) {
            return false;
        }
        return param0.a((byte) 53);
    }

    final static void a(tg param0, int param1) {
        wa.a(true);
        na.a(param0.field_v, param0.field_t, param0.field_o);
        if (param1 != 1) {
            return;
        }
    }

    static {
    }
}
