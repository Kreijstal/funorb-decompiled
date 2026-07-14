/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends uf {
    static int field_q;
    mf[] field_j;
    int field_p;
    int field_i;
    static int field_l;
    static boolean field_h;
    static int field_n;
    mf[] field_s;
    int[] field_r;
    int[] field_k;
    int[] field_m;
    byte[][][] field_o;
    static int field_t;

    final static int a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = Terraphoenix.field_V;
        if (!param1) {
            return -51;
        }
        for (var2 = 0; ph.field_n.length > var2; var2++) {
            if (!(!param0.equals((Object) (Object) ph.field_n[var2]))) {
                return var2;
            }
        }
        return 0;
    }

    final static void c(int param0) {
        dg.field_d = false;
        ia.field_r = null;
        kj.field_c = null;
        if (param0 != 25501) {
            return;
        }
        ec.field_d = null;
        km.field_c = null;
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 31996) {
            break L0;
          } else {
            boolean discarded$2 = wf.a(-109);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (q.field_Jb ^ -1)) {
              break L2;
            } else {
              if (uh.field_H < 13) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    wf() {
    }

    final static oa a(int param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Terraphoenix.field_V;
        int var2 = param1.length();
        for (var3 = param0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (48 > var4) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return ge.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = -1;
        field_t = -1;
    }
}
