/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends at {
    static boolean field_p;
    private String field_k;
    static String field_l;
    private int field_n;
    private ad field_o;
    static du field_j;
    private int field_m;

    private final void f(int param0) {
        if (param0 != 7) {
            field_l = (String) null;
        }
    }

    public static void d(int param0) {
        if (param0 != 10) {
            return;
        }
        field_l = null;
        field_j = null;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        L0: {
          if (this.field_n == 0) {
            this.field_o.a(this.field_m, 97, this.field_k);
            break L0;
          } else {
            break L0;
          }
        }
        var2 = 122 % ((param0 - 71) / 47);
        int fieldTemp$2 = this.field_n + 1;
        this.field_n = this.field_n + 1;
        if (fieldTemp$2 >= this.e(-12304)) {
          this.f(7);
          return true;
        } else {
          return false;
        }
    }

    private final int e(int param0) {
        boolean discarded$0 = false;
        if (param0 != -12304) {
            discarded$0 = this.c((byte) 38);
            return 10;
        }
        return 10;
    }

    wn(ad param0, String param1, int param2) {
        try {
            this.field_k = param1;
            this.field_m = param2;
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_l = "Asking to join <%0>'s game...";
        field_j = new du(7, 0, 1, 1);
    }
}
