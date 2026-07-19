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
        if (null != this.field_f) {
          var2 = this.field_c[(int)(this.field_d & (long)(this.field_e + param0))];
          L0: while (true) {
            if (this.field_f != var2) {
              if (this.field_f.field_l == this.field_d) {
                var3 = this.field_f;
                this.field_f = this.field_f.field_p;
                return var3;
              } else {
                this.field_f = this.field_f.field_p;
                continue L0;
              }
            } else {
              this.field_f = null;
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
        this.field_d = param0;
        var4 = this.field_c[(int)(param0 & (long)(this.field_e + -1))];
        this.field_f = var4.field_p;
        L0: while (true) {
          if (var4 != this.field_f) {
            if (param0 == this.field_f.field_l) {
              var5 = this.field_f;
              this.field_f = this.field_f.field_p;
              return var5;
            } else {
              this.field_f = this.field_f.field_p;
              continue L0;
            }
          } else {
            var5_int = -54 / ((24 - param1) / 36);
            this.field_f = null;
            return null;
          }
        }
    }

    final void a(ta param0, long param1, int param2) {
        ta discarded$0 = null;
        ta var5 = null;
        try {
            if (param2 != 0) {
                discarded$0 = this.a(-67L, 6);
            }
            if (param0.field_j != null) {
                param0.h(0);
            }
            var5 = this.field_c[(int)((long)(-1 + this.field_e) & param1)];
            param0.field_p = var5;
            param0.field_j = var5.field_j;
            param0.field_j.field_p = param0;
            param0.field_p.field_j = param0;
            param0.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "uk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
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
            field_b = (int[]) null;
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
            field_b = (int[]) null;
        }
    }

    uk(int param0) {
        int var2 = 0;
        ta dupTemp$0 = null;
        ta var3 = null;
        this.field_c = new ta[param0];
        this.field_e = param0;
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new ta();
            var3 = dupTemp$0;
            this.field_c[var2] = dupTemp$0;
            var3.field_p = var3;
            var3.field_j = var3;
        }
    }

    static {
        field_b = new int[256];
    }
}
