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
        int var2 = 0;
        if (((ff) this).field_s) {
          var2 = 108 % ((67 - param0) / 47);
          if (null != ((ff) this).field_w) {
            if (((ff) this).field_m == ((ff) this).field_w.field_z) {
              if (((ff) this).field_i != ((ff) this).field_w.field_w) {
                ((ff) this).field_w.b(((ff) this).field_k, ((ff) this).field_t, ((ff) this).field_m, ((ff) this).field_i);
                return;
              } else {
                ((ff) this).field_w.f(((ff) this).field_k, ((ff) this).field_t);
                return;
              }
            } else {
              ((ff) this).field_w.b(((ff) this).field_k, ((ff) this).field_t, ((ff) this).field_m, ((ff) this).field_i);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    ff(int param0, int param1, int param2, int param3, bi param4) {
        super(param0, param1, param2, param3);
        ((ff) this).field_w = param4;
    }

    public static void e(byte param0) {
        field_x = null;
        field_v = null;
        if (param0 >= -17) {
            field_x = null;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    ff(int param0, int param1, bi param2) {
        super(param0, param1, param2.field_z, param2.field_w);
        ((ff) this).field_w = param2;
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 34) {
          L0: {
            field_y = 45;
            if (null != ((ff) this).field_w) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null != ((ff) this).field_w) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, bi param1) {
        ((ff) this).field_w = param1;
        if (param0 != -2948) {
            boolean discarded$0 = ((ff) this).d((byte) 56);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
