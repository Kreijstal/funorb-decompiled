/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bq {
    static String[] field_a;
    static int[] field_d;
    static da field_c;
    fr field_b;

    final static an a(boolean param0, int param1) {
        an var2 = new an(true);
        var2.field_c = param0 ? true : false;
        if (param1 == 8192) {
          return var2;
        }
        field_d = (int[]) null;
        return var2;
    }

    final static void a(int param0) {
        if (param0 == 8192) {
          cb.field_b = false;
          ig.field_a.e(param0 ^ -23110);
          return;
        }
        field_d = (int[]) null;
        cb.field_b = false;
        ig.field_a.e(param0 ^ -23110);
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
