/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private um field_e;
    private v field_d;
    private um field_b;
    static int field_c;
    static lc field_a;
    static int field_h;
    static String field_f;
    static he field_g;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param2 != 4239) {
            kj.a((byte) -55);
            if (!(pj.field_h == null)) {
                var3 = pj.field_h.b(param0, (byte) -95);
                if (var3 == -2) {
                    return;
                }
                if (!((var3 ^ -1) == 0)) {
                    var4 = pj.field_h.b(false) ? 1 : 0;
                    ng.a(param1, var4 != 0, pj.field_h.field_Lb, var3, pj.field_h.a(true), 79);
                }
                pj.field_h = null;
                fi.a(-393711775);
            }
            return;
        }
        if (pj.field_h == null) {
            return;
        }
        var3 = pj.field_h.b(param0, (byte) -95);
        if (var3 != -2) {
            if (!((var3 ^ -1) == 0)) {
                var4 = pj.field_h.b(false) ? 1 : 0;
                ng.a(param1, var4 != 0, pj.field_h.field_Lb, var3, pj.field_h.a(true), 79);
            }
            pj.field_h = null;
            fi.a(-393711775);
        }
    }

    final j a(int param0, int param1) {
        j var3 = null;
        byte[] var4 = null;
        j var5 = null;
        var3 = (j) ((kj) this).field_d.a((byte) -77, (long)param0);
        if (param1 == 0) {
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if ((param0 ^ -1) > -32769) {
                var4 = ((kj) this).field_e.a(0, param0, 5847);
                break L0;
              } else {
                var4 = ((kj) this).field_b.a(0, param0 & 32767, 5847);
                break L0;
              }
            }
            var5 = new j();
            if (var4 == null) {
              if (-32769 >= (param0 ^ -1)) {
                var5.f(0);
                ((kj) this).field_d.a((long)param0, 1, (Object) (Object) var5);
                return var5;
              } else {
                ((kj) this).field_d.a((long)param0, 1, (Object) (Object) var5);
                return var5;
              }
            } else {
              var5.a(new p(var4), param1 ^ 0);
              if (-32769 < (param0 ^ -1)) {
                ((kj) this).field_d.a((long)param0, 1, (Object) (Object) var5);
                return var5;
              } else {
                var5.f(0);
                ((kj) this).field_d.a((long)param0, 1, (Object) (Object) var5);
                return var5;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        int var1 = -16 % ((param0 - -18) / 61);
        field_f = null;
        field_g = null;
        field_a = null;
    }

    kj(int param0, um param1, um param2) {
        ((kj) this).field_d = new v(64);
        ((kj) this).field_e = param1;
        ((kj) this).field_b = param2;
        if (((kj) this).field_e != null) {
            int discarded$0 = ((kj) this).field_e.a((byte) -67, 0);
        }
        if (((kj) this).field_b != null) {
            int discarded$1 = ((kj) this).field_b.a((byte) -106, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_f = "<%0> is not on your friend list.";
    }
}
