/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static String[] field_e;
    int field_f;
    int field_d;
    static ql field_a;
    int[] field_c;
    static bh field_b;

    final int a(int param0) {
        er var3;
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 6586) {
            break L0;
          } else {
            var3 = (er) null;
            lq.a((er) null, (byte) 110);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_c == null) {
              break L2;
            } else {
              if (this.field_c.length != 0) {
                stackIn_7_0 = this.field_c[-1 + this.field_c.length];
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (null == this.field_c || 0 == this.field_c.length) {
            return 0;
        }
        if (param1) {
            this.field_f = 59;
        }
        for (var3 = 1; var3 < this.field_c.length; var3++) {
            if (this.field_c[var3] + this.field_c[var3 + -1] >> 501033697 > param0) {
                return -1 + var3;
            }
        }
        return this.field_c.length + -1;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0) {
            er var2 = (er) null;
            lq.a((er) null, (byte) -50);
        }
    }

    lq(int param0, int param1, int param2) {
        this.field_f = param0;
        this.field_d = param1;
        this.field_c = new int[param2 + 1];
    }

    final static void a(er param0, byte param1) {
        if (param1 != -94) {
            return;
        }
        try {
            tg.a((byte) -110);
            bi.a(param0.field_F, param0.field_x, param0.field_B);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "lq.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = new String[]{"Showing by rating", "Showing by win percentage"};
        field_b = null;
    }
}
