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
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          lk.field_a[pb.field_b] = param0;
          pf.field_b[pb.field_b] = pb.field_b;
          a.field_c[pb.field_b] = param4;
          if (param4 < hm.field_L) {
            bd.field_a = param4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param4 > ok.field_j) {
            el.field_d = param4;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          oa.field_a[pb.field_b] = param3;
          oa.field_c[pb.field_b] = param5;
          dd.field_L[pb.field_b] = param2;
          var6 = param5 + param3 - -param2;
          if (param1 != (var6 ^ -1)) {
            stackOut_8_0 = 1000 * param3 / var6;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 0;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        var7 = stackIn_9_0;
        al.field_bb[pb.field_b] = var7;
        if (var7 >= bd.field_a) {
          pb.field_b = pb.field_b + 1;
          if (var7 > el.field_d) {
            el.field_d = var7;
            return;
          } else {
            return;
          }
        } else {
          bd.field_a = var7;
          pb.field_b = pb.field_b + 1;
          if (var7 <= el.field_d) {
            return;
          } else {
            el.field_d = var7;
            return;
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        var1 = fc.field_e[0];
        var2 = 1;
        L0: while (true) {
          if (fc.field_e.length <= var2) {
            if (!param0) {
              th.a(-28, 48, 126, -100, 80, 111);
              return;
            } else {
              return;
            }
          } else {
            var3 = fc.field_e[var2];
            ka.a(qh.field_c, var2 << 1770517252, qh.field_c, var1, var3);
            var1 = var1 + var3;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_e = null;
        if (param0 <= 74) {
            field_g = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    th(int param0, String param1, th param2) {
        ((th) this).field_b = param1;
        ((th) this).field_a = param0;
        ((th) this).field_f = param2;
        ((th) this).field_d = 0;
        ((th) this).field_h = false;
        if (((th) this).field_a == -1) {
            ((th) this).field_d = 250;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "ASM-C";
        field_c = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_g = new cf();
    }
}
