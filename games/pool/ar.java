/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar implements eb {
    int field_c;
    int field_e;
    int field_a;
    int field_b;
    static String field_g;
    int field_f;
    int field_d;
    int field_h;

    public final void a(int[] param0, int param1) {
        if (param1 != -32215) {
            return;
        }
        qh.a(((ar) this).field_h, ((ar) this).field_f, ((ar) this).field_b, 127, dq.field_a.b(((ar) this).field_d, 0));
    }

    public final int b(int[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -27) {
          var4 = null;
          int discarded$2 = ((ar) this).b((int[]) null, 59);
          return param0[9] * ((ar) this).field_c + (((ar) this).field_e * param0[10] + ((ar) this).field_a * param0[11]);
        } else {
          return param0[9] * ((ar) this).field_c + (((ar) this).field_e * param0[10] + ((ar) this).field_a * param0[11]);
        }
    }

    public static void a(int param0) {
        if (param0 != 10) {
            field_g = null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static void a(int param0, vh param1) {
        param1.field_X = ln.field_s;
        param1.field_N = 16777215;
        if (param0 != 29022) {
          ar.a((byte) 26);
          param1.field_Gb = ln.field_s;
          param1.field_Fb = 1;
          param1.field_cb = 1;
          param1.field_I = (lr) (Object) sa.field_h;
          param1.field_F = rm.field_g;
          return;
        } else {
          param1.field_Gb = ln.field_s;
          param1.field_Fb = 1;
          param1.field_cb = 1;
          param1.field_I = (lr) (Object) sa.field_h;
          param1.field_F = rm.field_g;
          return;
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        var6 = lq.field_T;
        var5 = var6;
        var4 = var5;
        var1 = var4;
        var2 = 0;
        var3 = var6.length;
        if (param0 == 48) {
          L0: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              continue L0;
            }
          }
        } else {
          field_g = null;
          L1: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
