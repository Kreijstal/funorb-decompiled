/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static String[] field_a;
    static q field_c;
    static nv field_d;
    static String field_b;

    final static void a(int param0, int param1, int param2, kv param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + param3.field_t;
          param1 = param1 + param3.field_u;
          var4 = param1 * dg.field_i + param0;
          var5 = 0;
          var6 = param3.field_p;
          var7 = param3.field_q;
          var8 = -var7 + dg.field_i;
          var9 = 0;
          if (param1 < dg.field_j) {
            var10 = -param1 + dg.field_j;
            var6 = var6 - var10;
            var4 = var4 + var10 * dg.field_i;
            param1 = dg.field_j;
            var5 = var5 + var7 * var10;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 <= -12) {
          L1: {
            if (var6 + param1 > dg.field_k) {
              var6 = var6 - (-dg.field_k + (param1 + var6));
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param0 < dg.field_f) {
              var10 = dg.field_f + -param0;
              var4 = var4 + var10;
              var8 = var8 + var10;
              var7 = var7 - var10;
              var5 = var5 + var10;
              param0 = dg.field_f;
              var9 = var9 + var10;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (dg.field_h >= param0 + var7) {
              break L3;
            } else {
              var10 = -dg.field_h + var7 + param0;
              var9 = var9 + var10;
              var7 = var7 - var10;
              var8 = var8 + var10;
              break L3;
            }
          }
          if (var7 > 0) {
            if (0 >= var6) {
              return;
            } else {
              dk.a(0, 0, var7, dg.field_e, var8, var9, 0, var4, param3.field_v, 455530063, var5, 0, var6);
              return;
            }
          } else {
            return;
          }
        } else {
          L4: {
            field_b = null;
            if (var6 + param1 > dg.field_k) {
              var6 = var6 - (-dg.field_k + (param1 + var6));
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (param0 < dg.field_f) {
              var10 = dg.field_f + -param0;
              var4 = var4 + var10;
              var8 = var8 + var10;
              var7 = var7 - var10;
              var5 = var5 + var10;
              param0 = dg.field_f;
              var9 = var9 + var10;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (dg.field_h >= param0 + var7) {
              break L6;
            } else {
              var10 = -dg.field_h + var7 + param0;
              var9 = var9 + var10;
              var7 = var7 - var10;
              var8 = var8 + var10;
              break L6;
            }
          }
          if (var7 > 0) {
            if (0 >= var6) {
              return;
            } else {
              dk.a(0, 0, var7, dg.field_e, var8, var9, 0, var4, param3.field_v, 455530063, var5, 0, var6);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 >= -11) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
