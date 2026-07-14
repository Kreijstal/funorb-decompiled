/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends wl {
    int field_i;
    int field_r;
    static boolean field_s;
    int[] field_p;
    int[] field_t;
    byte[][][] field_k;
    jh[] field_l;
    static volatile boolean field_o;
    static String field_q;
    static vi field_n;
    jh[] field_m;
    int[] field_j;

    final static void a(o param0, boolean param1) {
        if (param1) {
            Object var3 = null;
            pk.a((o) null, true);
            ag.field_v = param0;
            return;
        }
        ag.field_v = param0;
    }

    final static boolean a(byte param0) {
        if (param0 == -35) {
          if (null != kj.field_b) {
            if (kj.field_b.f(0) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          pk.a(63);
          if (null != kj.field_b) {
            if (kj.field_b.f(0) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_q = null;
        if (param0 != -15563) {
            boolean discarded$0 = pk.a((byte) 103);
        }
    }

    pk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = true;
        field_q = "Quit to website";
        field_o = true;
    }
}
