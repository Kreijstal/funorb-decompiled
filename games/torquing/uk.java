/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static int[] field_a;
    static int[] field_b;
    private ta field_f;
    private int field_e;
    private ta[] field_c;
    private long field_d;

    final ta b(int param0) {
        ta var2 = null;
        ta var3 = null;
        int var4 = 0;
        var4 = Torquing.field_u;
        if (null != ((uk) this).field_f) {
          var2 = ((uk) this).field_c[(int)(((uk) this).field_d & (long)(((uk) this).field_e + param0))];
          L0: while (true) {
            if (((uk) this).field_f != var2) {
              if (((uk) this).field_f.field_l == ((uk) this).field_d) {
                var3 = ((uk) this).field_f;
                ((uk) this).field_f = ((uk) this).field_f.field_p;
                return var3;
              } else {
                ((uk) this).field_f = ((uk) this).field_f.field_p;
                continue L0;
              }
            } else {
              ((uk) this).field_f = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final ta a(long param0, int param1) {
        ta var4 = null;
        int var5_int = 0;
        ta var5 = null;
        int var6 = 0;
        var6 = Torquing.field_u;
        ((uk) this).field_d = param0;
        var4 = ((uk) this).field_c[(int)(param0 & (long)(((uk) this).field_e + -1))];
        ((uk) this).field_f = var4.field_p;
        L0: while (true) {
          if (var4 != ((uk) this).field_f) {
            if (param0 == ((uk) this).field_f.field_l) {
              var5 = ((uk) this).field_f;
              ((uk) this).field_f = ((uk) this).field_f.field_p;
              return var5;
            } else {
              ((uk) this).field_f = ((uk) this).field_f.field_p;
              continue L0;
            }
          } else {
            var5_int = -54 / ((24 - param1) / 36);
            ((uk) this).field_f = null;
            return null;
          }
        }
    }

    final void a(ta param0, long param1, int param2) {
        ta var5 = null;
        ta var6 = null;
        ta var7 = null;
        ta var8 = null;
        ta var9 = null;
        if (param2 == 0) {
          if (param0.field_j != null) {
            param0.h(0);
            var8 = ((uk) this).field_c[(int)((long)(-1 + ((uk) this).field_e) & param1)];
            var5 = var8;
            param0.field_p = var5;
            param0.field_j = var8.field_j;
            param0.field_j.field_p = param0;
            param0.field_p.field_j = param0;
            param0.field_l = param1;
            return;
          } else {
            var9 = ((uk) this).field_c[(int)((long)(-1 + ((uk) this).field_e) & param1)];
            var5 = var9;
            param0.field_p = var5;
            param0.field_j = var9.field_j;
            param0.field_j.field_p = param0;
            param0.field_p.field_j = param0;
            param0.field_l = param1;
            return;
          }
        } else {
          ta discarded$1 = ((uk) this).a(-67L, 6);
          if (param0.field_j == null) {
            var6 = ((uk) this).field_c[(int)((long)(-1 + ((uk) this).field_e) & param1)];
            var5 = var6;
            param0.field_p = var5;
            param0.field_j = var6.field_j;
            param0.field_j.field_p = param0;
            param0.field_p.field_j = param0;
            param0.field_l = param1;
            return;
          } else {
            param0.h(0);
            var7 = ((uk) this).field_c[(int)((long)(-1 + ((uk) this).field_e) & param1)];
            var5 = var7;
            param0.field_p = var5;
            param0.field_j = var7.field_j;
            param0.field_j.field_p = param0;
            param0.field_p.field_j = param0;
            param0.field_l = param1;
            return;
          }
        }
    }

    final static boolean a(boolean param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            field_b = null;
            if (param1 != (-param1 & param1)) {
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
            if (param1 != (-param1 & param1)) {
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

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            field_b = null;
        }
    }

    uk(int param0) {
        int var2 = 0;
        ta var3 = null;
        ((uk) this).field_c = new ta[param0];
        ((uk) this).field_e = param0;
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new ta();
            ((uk) this).field_c[var2] = new ta();
            var3.field_p = var3;
            var3.field_j = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[256];
    }
}
