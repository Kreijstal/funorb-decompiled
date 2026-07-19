/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ba {
    int field_i;
    static le[][] field_a;
    static String field_d;
    static String field_c;
    static r field_f;
    java.awt.Image field_b;
    int[] field_e;
    int field_g;
    static String field_h;

    final static boolean a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var1 = wj.field_k;
        synchronized (var1) {
          L0: {
            if (o.field_b == bh.field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              oa.field_H = oi.field_e[o.field_b];
              rd.field_p = ia.field_d[o.field_b];
              o.field_b = o.field_b - param0 & 127;
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        }
        return stackIn_6_0 != 0;
    }

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    public static void a(boolean param0) {
        field_h = null;
        field_a = (le[][]) null;
        if (param0) {
            return;
        }
        field_f = null;
        field_d = null;
        field_c = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final void a(byte param0) {
        if (param0 < 106) {
          this.field_e = (int[]) null;
          ge.a(this.field_e, this.field_g, this.field_i);
          return;
        } else {
          ge.a(this.field_e, this.field_g, this.field_i);
          return;
        }
    }

    static {
        field_d = "Please check if address is correct";
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_a = new le[7][];
    }
}
