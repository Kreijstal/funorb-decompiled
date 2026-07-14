/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static ak field_l;
    static wm field_d;
    static volatile boolean field_j;
    static tf field_k;
    private fm field_c;
    private fm field_m;
    static volatile int field_b;
    static String field_e;
    private le field_i;
    static String field_g;
    static int field_h;
    static ak field_a;
    static tf field_f;
    static String field_n;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, tf[] param6, jl param7, int param8, tf[] param9, int param10, boolean param11) {
        if (param1 != -879) {
          field_h = 78;
          tj.a(param8, param11, param10, param5, param7, param6, param4, param0, param9, param2, param7, (byte) 122, param3, param0, param2);
          return;
        } else {
          tj.a(param8, param11, param10, param5, param7, param6, param4, param0, param9, param2, param7, (byte) 122, param3, param0, param2);
          return;
        }
    }

    final kp a(int param0, int param1) {
        kp var3 = null;
        kp var3_ref = null;
        byte[] var4 = null;
        if (param0 == -21209) {
          var3 = (kp) ((u) this).field_i.a((long)param1, 0);
          if (var3 == null) {
            L0: {
              if ((param1 ^ -1) <= -32769) {
                var4 = ((u) this).field_m.a(1, param1 & 32767, true);
                break L0;
              } else {
                var4 = ((u) this).field_c.a(1, param1, true);
                break L0;
              }
            }
            var3_ref = new kp();
            if (var4 != null) {
              L1: {
                var3_ref.a(param0 ^ 21212, new we(var4));
                if (32768 <= param1) {
                  var3_ref.g(126);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((u) this).field_i.a((long)param1, (Object) (Object) var3_ref, (byte) 83);
              return var3_ref;
            } else {
              L2: {
                if (32768 <= param1) {
                  var3_ref.g(126);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((u) this).field_i.a((long)param1, (Object) (Object) var3_ref, (byte) 83);
              return var3_ref;
            }
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_k = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_n = null;
        if (param0 < 24) {
          field_k = null;
          field_d = null;
          field_l = null;
          return;
        } else {
          field_d = null;
          field_l = null;
          return;
        }
    }

    u(int param0, fm param1, fm param2, hj param3) {
        ((u) this).field_i = new le(64);
        ((u) this).field_c = param1;
        ((u) this).field_m = param2;
        if (null != ((u) this).field_c) {
            int discarded$0 = ((u) this).field_c.b(1, (byte) 87);
        }
        if (((u) this).field_m != null) {
            int discarded$1 = ((u) this).field_m.b(1, (byte) 35);
        }
    }

    final static void a(boolean param0, int param1) {
        qh.a((byte) -110, 10, bj.field_c[param1], true);
        if (param0) {
            u.a(-24);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_j = false;
        field_e = "Reject";
        field_g = "Open";
        field_h = -1;
        field_n = "to keep fullscreen or";
        field_d = new wm(13, 0, 1, 0);
    }
}
