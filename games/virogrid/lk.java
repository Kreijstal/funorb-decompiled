/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends km {
    boolean field_Sb;
    static int[] field_Tb;
    static byte[] field_Pb;
    int field_Gb;
    km field_Lb;
    String field_Nb;
    long field_Ib;
    long field_Ob;
    boolean field_Xb;
    km field_Hb;
    int field_Wb;
    int field_Rb;
    int field_Ub;
    int field_Vb;
    km field_Mb;
    boolean field_Jb;
    km field_Kb;
    km field_Yb;
    String field_Eb;
    int field_Fb;
    static il field_Qb;

    final boolean g(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            lk.e((byte) -9);
            if (((lk) this).a(1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((lk) this).a(1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(String param0, String param1, int param2) {
        CharSequence var5 = null;
        CharSequence var6 = null;
        ((lk) this).field_Eb = param0;
        if (param2 != 0) {
          ((lk) this).field_Nb = null;
          ((lk) this).field_Nb = param1;
          var5 = (CharSequence) (Object) ((lk) this).field_Nb;
          String discarded$4 = c.a(var5, true);
          return;
        } else {
          ((lk) this).field_Nb = param1;
          var6 = (CharSequence) (Object) ((lk) this).field_Nb;
          String discarded$5 = c.a(var6, true);
          return;
        }
    }

    final boolean a(int param0, lk param1) {
        if (((lk) this).field_Sb != param1.field_Sb) {
            return ((lk) this).field_Sb;
        }
        if (param0 < 1) {
            return true;
        }
        if (!((!((lk) this).field_Xb ? 1 : 0) == (!param1.field_Xb ? 1 : 0))) {
            return ((lk) this).field_Xb;
        }
        return (param1.field_Ib ^ -1L) < (((lk) this).field_Ib ^ -1L) ? true : false;
    }

    public static void e(byte param0) {
        field_Tb = null;
        if (param0 != 10) {
            return;
        }
        field_Pb = null;
        field_Qb = null;
    }

    lk(String param0, String param1, long param2) {
        super(0L, (km) null);
        ((lk) this).field_Ob = param2;
        ((lk) this).field_Nb = param0;
        ((lk) this).field_Eb = param1;
        CharSequence var6 = (CharSequence) (Object) ((lk) this).field_Nb;
        String discarded$0 = c.a(var6, true);
    }

    static {
    }
}
