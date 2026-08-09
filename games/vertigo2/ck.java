/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends d {
    static String[][] field_H;
    static String field_K;
    static fi field_I;
    static int field_J;

    final void a(int param0, int param1, byte param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (this.field_G) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((ck) (this)).field_G = stackIn_3_1 != 0;
        if (param2 <= 111) {
          ck.b(false);
          super.a(param0, param1, (byte) 126, param3);
          return;
        } else {
          super.a(param0, param1, (byte) 126, param3);
          return;
        }
    }

    private ck(String param0, ur param1, uf param2) {
        super(param0, param1, param2);
        try {
            this.field_B = eb.field_c.field_g;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ck(String param0, uf param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_G = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(boolean param0) {
        field_K = null;
        if (!param0) {
            return;
        }
        field_H = (String[][]) null;
        field_I = null;
    }

    private ck(String param0, uf param1) {
        this(param0, eb.field_c.field_p, param1);
        try {
            this.field_B = eb.field_c.field_g;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = "Message lobby";
    }
}
