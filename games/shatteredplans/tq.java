/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    private int field_e;
    static bc field_f;
    private boolean field_c;
    static String field_a;
    private int field_h;
    static String field_i;
    private String[] field_d;
    static char[] field_g;
    static qh field_j;
    static String field_k;
    static wj field_b;

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 == 231) {
          var3 = this.field_d.length;
          L0: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (this.field_c) {
                if (var3 != 0) {
                  var3 = var3 * this.field_h;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              } else {
                var3 = var3 + this.field_h;
                continue L0;
              }
            }
          }
        } else {
          return -32;
        }
    }

    final void a(String param0, int param1) {
        try {
            if (param1 >= -122) {
                this.field_c = false;
            }
            this.a(95, this.field_e - -1, param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "tq.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, String param2) {
        if (!(param1 <= this.field_e)) {
            this.field_e = param1;
        }
        if (!(param1 < this.field_d.length)) {
            this.a((byte) -45, param1);
        }
        if (param0 != 95) {
            return;
        }
        try {
            this.field_d[param1] = param2;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "tq.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        int var2 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        StringBuilder var4 = new StringBuilder();
        StringBuilder var1 = var4;
        StringBuilder discarded$0 = var1.append("[");
        for (var2 = 0; var2 < this.field_e; var2++) {
            if (0 != var2) {
                discarded$1 = var1.append(", ");
            }
            discarded$2 = var4.append(this.field_d[var2]);
        }
        StringBuilder discarded$3 = var1.append("]");
        return var1.toString();
    }

    private final void a(byte param0, int param1) {
        if (param0 != -45) {
            return;
        }
        String[] var3 = new String[this.a(param1, 231)];
        ps.a(this.field_d, 0, var3, 0, this.field_d.length);
        this.field_d = var3;
    }

    final String[] a(int param0) {
        String[] var2 = new String[this.field_e - -1];
        if (param0 != 220) {
            this.field_e = 1;
        }
        ps.a(this.field_d, 0, var2, 0, this.field_e + 1);
        return var2;
    }

    public static void b(int param0) {
        field_k = null;
        field_f = null;
        if (param0 != -31203) {
            return;
        }
        field_g = null;
        field_a = null;
        field_j = null;
        field_i = null;
        field_b = null;
    }

    tq(int param0, boolean param1) {
        this.field_d = new String[]{};
        this.field_e = -1;
        this.field_c = false;
        this.field_h = param0;
        this.field_c = param1 ? true : false;
    }

    static {
        field_a = "You are invited to <%0>'s game.";
        field_i = "Year of <%0>";
        field_b = null;
        field_g = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_k = "Respect";
    }
}
