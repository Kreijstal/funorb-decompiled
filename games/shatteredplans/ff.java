/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends vd {
    static int[][] field_x;
    static int field_u;
    private bi field_w;
    static int field_y;
    static String[] field_v;

    final void a(int param0) {
        if (!this.field_s) {
          return;
        }
        int var2 = 108 % ((67 - param0) / 47);
        if (null == this.field_w) {
          return;
        }
        if (this.field_m != this.field_w.field_z) {
          this.field_w.b(this.field_k, this.field_t, this.field_m, this.field_i);
          return;
        }
        if (this.field_i == this.field_w.field_w) {
          this.field_w.f(this.field_k, this.field_t);
          return;
        }
        this.field_w.b(this.field_k, this.field_t, this.field_m, this.field_i);
    }

    ff(int param0, int param1, int param2, int param3, bi param4) {
        super(param0, param1, param2, param3);
        try {
          this.field_w = param4;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ff.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_x = (int[][]) null;
        field_v = null;
        if (param0 >= -17) {
          field_x = (int[][]) null;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    ff(int param0, int param1, bi param2) {
        super(param0, param1, param2.field_z, param2.field_w);
        try {
          this.field_w = param2;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ff.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean d(byte param0) {
        if (param0 == 34) {
          return null == this.field_w ? true : false;
        }
        field_y = 45;
        return null == this.field_w ? true : false;
    }

    final void a(int param0, bi param1) {
        try {
          this.field_w = param1;
          if (param0 != -2948) {
            this.d((byte) 56);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ff.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
