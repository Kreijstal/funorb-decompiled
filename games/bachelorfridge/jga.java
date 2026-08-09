/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jga extends ana {
    static be[] field_y;
    static kia field_z;
    private taa field_x;
    static String field_v;
    private naa field_w;

    final boolean c(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        var2 = -89 % ((71 - param0) / 47);
        if (!this.field_m.a((byte) -106)) {
          if (!this.field_x.a((byte) -106)) {
            fieldTemp$1 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if (0 <= fieldTemp$1) {
              if (25 == this.field_l) {
                this.c(false);
                return false;
              } else {
                return false;
              }
            } else {
              this.b(false);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    jga(gj param0, naa param1) {
        super(param0, param1);
        try {
            this.field_w = param1;
            this.field_x = new taa(this.field_q, this.field_w.field_q, this.field_w.field_t);
            this.a(27799, this.field_x);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
            return;
        }
        field_y = null;
        field_z = null;
        field_v = null;
    }

    private final void c(boolean param0) {
        int var2;
        aj var3;
        haa var4;
        int var5;
        haa stackIn_4_0;
        haa stackIn_4_1;
        gj stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        haa stackIn_5_0;
        haa stackIn_5_1;
        gj stackIn_5_2;
        int stackIn_5_3;
        int stackIn_5_4;
        int stackIn_5_5;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (this.field_w.field_u <= var2) {
            if (param0) {
              field_v = (String) null;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              var3 = this.field_w.field_s[var2];
              stackIn_4_0 = null;

              stackIn_4_1 = null;

              stackIn_4_2 = this.field_q;

              stackIn_4_3 = var3.field_c;

              stackIn_4_4 = var3.field_a;

              if (this.field_w.field_r != var2) {
                stackIn_5_0 = null;
                stackIn_5_1 = null;
                stackIn_5_2 = (gj) ((Object) stackIn_4_2);
                stackIn_5_3 = stackIn_4_3;
                stackIn_5_4 = stackIn_4_4;
                stackIn_5_5 = 0;
                break L1;
              } else {
                stackIn_5_0 = null;
                stackIn_5_1 = null;
                stackIn_5_2 = (gj) ((Object) stackIn_4_2);
                stackIn_5_3 = stackIn_4_3;
                stackIn_5_4 = stackIn_4_4;
                stackIn_5_5 = 1;
                break L1;
              }
            }
            var4 = new haa(stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5 != 0);
            ((kj) ((Object) var4)).a(0);
            var2++;
            continue L0;
          }
        }
    }

    private final void b(boolean param0) {
        if (param0) {
            field_v = (String) null;
        }
    }

    static {
        field_y = new be[71];
        field_v = null;
    }
}
