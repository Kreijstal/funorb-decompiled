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
        var3 = ((tq) this).field_d.length;
        L0: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (((tq) this).field_c) {
              if (var3 != 0) {
                var3 = var3 * ((tq) this).field_h;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            } else {
              var3 = var3 + ((tq) this).field_h;
              continue L0;
            }
          }
        }
    }

    final void a(String param0, int param1) {
        try {
            if (param1 >= -122) {
                ((tq) this).field_c = false;
            }
            this.a(95, ((tq) this).field_e - -1, param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "tq.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void a(int param0, int param1, String param2) {
        if (!(param1 <= ((tq) this).field_e)) {
            ((tq) this).field_e = param1;
        }
        if (!(param1 < ((tq) this).field_d.length)) {
            this.a((byte) -45, param1);
        }
        try {
            ((tq) this).field_d[param1] = param2;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "tq.D(" + 95 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public final String toString() {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        StringBuilder var4 = new StringBuilder();
        StringBuilder var1 = var4;
        StringBuilder discarded$0 = var1.append("[");
        for (var2 = 0; var2 < ((tq) this).field_e; var2++) {
            if (0 != var2) {
                StringBuilder discarded$1 = var1.append(", ");
            }
            StringBuilder discarded$2 = var4.append(((tq) this).field_d[var2]);
        }
        StringBuilder discarded$3 = var1.append("]");
        return var1.toString();
    }

    private final void a(byte param0, int param1) {
        String[] var3 = new String[this.a(param1, 231)];
        ps.a((Object[]) (Object) ((tq) this).field_d, 0, (Object[]) (Object) var3, 0, ((tq) this).field_d.length);
        ((tq) this).field_d = var3;
    }

    final String[] a(int param0) {
        String[] var2 = new String[((tq) this).field_e - -1];
        if (param0 != 220) {
            ((tq) this).field_e = 1;
        }
        ps.a((Object[]) (Object) ((tq) this).field_d, 0, (Object[]) (Object) var2, 0, ((tq) this).field_e + 1);
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
        ((tq) this).field_d = new String[]{};
        ((tq) this).field_e = -1;
        ((tq) this).field_c = false;
        ((tq) this).field_h = param0;
        ((tq) this).field_c = param1 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You are invited to <%0>'s game.";
        field_i = "Year of <%0>";
        field_b = null;
        field_g = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_k = "Respect";
    }
}
