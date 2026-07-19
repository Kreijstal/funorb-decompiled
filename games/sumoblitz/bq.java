/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bq {
    static String[] field_a;
    static int[] field_d;
    static da field_c;
    fr field_b;

    final static an a(boolean param0, int param1) {
        an var2 = null;
        an stackIn_1_0 = null;
        an stackIn_2_0 = null;
        an stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        an stackOut_0_0 = null;
        an stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        an stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = new an(true);
          stackOut_0_0 = (an) (var2);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (an) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (an) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_c = stackIn_3_1 != 0;
        if (param1 != 8192) {
          field_d = (int[]) null;
          return var2;
        } else {
          return var2;
        }
    }

    final static void a(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        if (param0 != 8192) {
          field_d = (int[]) null;
          cb.field_b = false;
          discarded$4 = ig.field_a.e(param0 ^ -23110);
          return;
        } else {
          cb.field_b = false;
          discarded$5 = ig.field_a.e(param0 ^ -23110);
          return;
        }
    }

    abstract void b(int param0);

    abstract void a(byte param0, int param1, ht param2);

    abstract void a(int param0, boolean param1);

    abstract void a(byte param0, boolean param1);

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != -76) {
            field_c = (da) null;
        }
    }

    abstract boolean b(byte param0);

    bq(fr param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "bq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(byte param0, int param1, int param2);

    static {
        field_d = new int[8192];
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
