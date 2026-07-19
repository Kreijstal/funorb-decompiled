/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wj extends o {
    static int field_m;
    static vl field_o;
    static ml field_k;
    boolean field_p;
    boolean field_n;
    volatile boolean field_l;

    abstract int e(int param0);

    final static String g(int param0) {
        String discarded$6 = null;
        if (param0 == -16470) {
          if (!bm.field_e) {
            if (sd.field_g >= gk.field_b) {
              if (gk.field_b + df.field_i <= sd.field_g) {
                return null;
              } else {
                return ce.field_c;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          discarded$6 = wj.g(114);
          if (!bm.field_e) {
            if (sd.field_g >= gk.field_b) {
              if (gk.field_b + df.field_i <= sd.field_g) {
                return null;
              } else {
                return ce.field_c;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final static void b(byte param0) {
        if (param0 >= 112) {
          if (!vj.a(97)) {
            cc.field_f.a(true);
            return;
          } else {
            return;
          }
        } else {
          field_k = (ml) null;
          if (vj.a(97)) {
            return;
          } else {
            cc.field_f.a(true);
            return;
          }
        }
    }

    public static void c(byte param0) {
        int var1 = 121 % ((-48 - param0) / 35);
        field_k = null;
        field_o = null;
    }

    abstract byte[] f(int param0);

    final static void a(int param0, boolean param1, boolean param2) {
        String var4 = (String) null;
        hm.a((String) null, (byte) 33, param2, param1);
        if (param0 > -65) {
            field_k = (ml) null;
        }
    }

    wj() {
        this.field_l = true;
    }

    static {
    }
}
