/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static String field_i;
    int field_a;
    int field_g;
    static String[][] field_d;
    int field_e;
    static bi field_b;
    wa field_c;
    int field_h;
    int field_f;

    final void a(int param0, int param1, int param2, int param3, wa param4, int param5, byte param6) {
        try {
            if (param6 != -34) {
                wa.a((byte) -86, false, true);
            }
            this.field_h = param5;
            this.field_g = param1;
            this.field_c = param4;
            this.field_f = param3;
            this.field_e = param0;
            this.field_a = param2;
            if (!(-1 >= (this.field_h ^ -1))) {
                throw new RuntimeException();
            }
            if (-1 == (this.field_f ^ -1) && 0 == this.field_a) {
                if (this.field_e == 0 || this.field_h != 1) {
                    throw new RuntimeException();
                }
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "wa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        int var3 = 123 / ((param0 - 33) / 54);
        String var4 = (String) null;
        jm.a((String) null, param2, (byte) -110, param1);
    }

    public static void a(int param0) {
        if (param0 != 27094) {
          field_i = (String) null;
          field_b = null;
          field_i = null;
          field_d = (String[][]) null;
          return;
        } else {
          field_b = null;
          field_i = null;
          field_d = (String[][]) null;
          return;
        }
    }

    final void b(int param0) {
        this.field_c = qq.field_D;
        qq.field_D = (wa) (this);
        int var2 = 111 % ((param0 - -71) / 45);
    }

    wa() {
        this.field_c = null;
    }

    static {
        field_i = "Average number of fleets committed to each operation.";
    }
}
