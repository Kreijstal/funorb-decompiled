/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    private pha field_d;
    static int field_g;
    private vr field_c;
    static int field_f;
    static String field_e;
    static boolean field_b;
    static int field_a;
    static String field_i;
    private vr field_h;

    public static void a(int param0) {
        if (param0 >= -8) {
            field_a = -25;
            field_e = null;
            field_i = null;
            return;
        }
        field_e = null;
        field_i = null;
    }

    final static String a(boolean param0) {
        if (kq.field_j == ola.field_p) {
            return wj.field_i;
        }
        if (!param0) {
            wk.a(44);
            return lb.field_w;
        }
        return lb.field_w;
    }

    final pda a(int param0, int param1) {
        pda var3 = null;
        pda var3_ref = null;
        byte[] var4 = null;
        var3 = (pda) ((wk) this).field_d.a(122, (long)param1);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if ((param1 ^ -1) <= -32769) {
              var4 = ((wk) this).field_h.b(-96, 1, param1 & 32767);
              break L0;
            } else {
              var4 = ((wk) this).field_c.b(-110, 1, param1);
              break L0;
            }
          }
          if (param0 == -22834) {
            var3_ref = new pda();
            if (var4 != null) {
              L1: {
                var3_ref.a(new lu(var4), (byte) 109);
                if (32768 <= param1) {
                  var3_ref.b(true);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((wk) this).field_d.a((long)param1, 1, (Object) (Object) var3_ref);
              return var3_ref;
            } else {
              L2: {
                if (32768 <= param1) {
                  var3_ref.b(true);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((wk) this).field_d.a((long)param1, 1, (Object) (Object) var3_ref);
              return var3_ref;
            }
          } else {
            return null;
          }
        }
    }

    wk(int param0, vr param1, vr param2, so param3) {
        ((wk) this).field_d = new pha(64);
        ((wk) this).field_h = param2;
        ((wk) this).field_c = param1;
        if (null != ((wk) this).field_c) {
            int discarded$0 = ((wk) this).field_c.d(1, 0);
        }
        if (null != ((wk) this).field_h) {
            int discarded$1 = ((wk) this).field_h.d(1, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_e = "Searching for opponents";
        field_i = "Return to game";
    }
}
