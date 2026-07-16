/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends hg {
    int field_m;
    int field_g;
    int field_o;
    static boolean[] field_h;
    int field_j;
    int[] field_q;
    int field_n;
    static boolean field_p;
    long field_l;
    int field_k;
    int field_i;

    public static void d(int param0) {
        field_h = null;
        if (param0 != 65535) {
            String discarded$0 = ik.a(false, false, (byte) -31, false);
        }
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4 = 0;
        if (param2 == -112) {
          L0: {
            var4 = 0;
            if (param0) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          if (!param1) {
            if (param3) {
              var4++;
              return wf.field_c[var4];
            } else {
              return wf.field_c[var4];
            }
          } else {
            var4 += 2;
            if (!param3) {
              return wf.field_c[var4];
            } else {
              var4++;
              return wf.field_c[var4];
            }
          }
        } else {
          return null;
        }
    }

    ik(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((ik) this).field_o = param2;
        ((ik) this).field_n = param4;
        ((ik) this).field_g = param5;
        ((ik) this).field_m = param3;
        ((ik) this).field_k = param1;
        ((ik) this).field_q = param6;
        ((ik) this).field_j = param0;
        int fieldTemp$0 = qh.field_m;
        qh.field_m = qh.field_m + 1;
        ((ik) this).field_i = 65535 & fieldTemp$0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new boolean[112];
    }
}
