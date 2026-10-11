/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static String field_e;
    int field_a;
    String field_b;
    th field_f;
    static String[] field_c;
    boolean field_h;
    static cf field_g;
    int field_d;
    static ci field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        lk.field_a[pb.field_b] = param0;
        pf.field_b[pb.field_b] = pb.field_b;
        a.field_c[pb.field_b] = param4;
        if (!(param4 >= hm.field_L)) {
          bd.field_a = param4;
        }
        if (!(param4 <= ok.field_j)) {
          el.field_d = param4;
        }
        oa.field_a[pb.field_b] = param3;
        oa.field_c[pb.field_b] = param5;
        dd.field_L[pb.field_b] = param2;
        int var6 = param5 + param3 + param2;
        int var7 = param1 == ~var6 ? 0 : 1000 * param3 / var6;
        al.field_bb[pb.field_b] = var7;
        if (var7 < bd.field_a) {
          bd.field_a = var7;
          pb.field_b = pb.field_b + 1;
          if (var7 > el.field_d) {
            el.field_d = var7;
            return;
          }
          return;
        }
        pb.field_b = pb.field_b + 1;
        if (var7 <= el.field_d) {
          return;
        }
        el.field_d = var7;
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          var1_int = fc.field_e[0];
          for (var2 = 1; fc.field_e.length > var2; var2++) {
            var3 = fc.field_e[var2];
            ka.a(qh.field_c, var2 << 4, qh.field_c, var1_int, var3);
            var1_int = var1_int + var3;
          }
          if (param0) {
            return;
          }
          th.a(-28, 48, 126, -100, 80, 111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "th.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_e = null;
        if (param0 <= 74) {
          field_g = (cf) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    th(int param0, String param1, th param2) {
        try {
          this.field_b = param1;
          this.field_a = param0;
          this.field_f = param2;
          this.field_d = 0;
          this.field_h = false;
          if (this.field_a == -1) {
            this.field_d = 250;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "th.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "ASM-C";
        field_c = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_g = new cf();
    }
}
