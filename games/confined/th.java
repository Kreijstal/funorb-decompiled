/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends ah {
    static String[] field_eb;
    static String field_fb;
    private oi field_db;
    static bi field_bb;
    static volatile boolean field_cb;

    th(hn param0, dj param1) {
        super(param0, param1, 0.4, 0.02, 64.0, ke.field_cb);
        ((th) this).field_db = new oi((pm) this);
        kj.a(n.field_a, 96, (pm) (Object) param1);
    }

    th(hn param0, ee param1, double[] param2, double param3, double param4, double param5) {
        super(param0, param1, 0.4, 0.02, 8.0, param2, param3, param4, param5, ke.field_cb);
        ((th) this).field_db = new oi((pm) this);
        kj.a(n.field_a, 96, (pm) (Object) param1);
    }

    public static void m(int param0) {
        if (param0 != 256) {
          th.m(97);
          field_eb = null;
          field_bb = null;
          field_fb = null;
          return;
        } else {
          field_eb = null;
          field_bb = null;
          field_fb = null;
          return;
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        double[] var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double[] var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        double[] var18 = null;
        double[] var19 = null;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (((th) this).field_N) {
          return;
        } else {
          var19 = new double[12];
          var18 = var19;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var7 = var15;
          ((th) this).field_ab.a((byte) 91, var19);
          var8 = var19[9];
          if (param2 < -5) {
            L0: {
              var10 = var19[10];
              var12 = var19[11];
              if (param3.field_N * var12 + (var10 * param3.field_H + param3.field_P * var8) <= 0.0) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_15_0 = 1;
                stackIn_17_0 = stackOut_15_0;
                break L0;
              }
            }
            L1: {
              var14 = stackIn_17_0;
              if (var14 != 0) {
                ((th) this).a(e.field_a, ((th) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                break L1;
              } else {
                break L1;
              }
            }
            pa.a(-(((th) this).field_C * var8) + ((th) this).field_E, 0.2 * ((th) this).field_C, (byte) -11, 256, ((th) this).field_D - ((th) this).field_C * var12, -(((th) this).field_C * var10) + ((th) this).field_t, wb.field_a, param1, param3);
            if (var14 == 0) {
              ((th) this).a(e.field_a, ((th) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
              return;
            } else {
              return;
            }
          } else {
            L2: {
              field_bb = null;
              var10 = var19[10];
              var12 = var19[11];
              if (param3.field_N * var12 + (var10 * param3.field_H + param3.field_P * var8) <= 0.0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var14 = stackIn_7_0;
              if (var14 != 0) {
                ((th) this).a(e.field_a, ((th) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
                break L3;
              } else {
                break L3;
              }
            }
            pa.a(-(((th) this).field_C * var8) + ((th) this).field_E, 0.2 * ((th) this).field_C, (byte) -11, 256, ((th) this).field_D - ((th) this).field_C * var12, -(((th) this).field_C * var10) + ((th) this).field_t, wb.field_a, param1, param3);
            if (var14 == 0) {
              ((th) this).a(e.field_a, ((th) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(mn param0, byte param1) {
        double[] var13 = new double[12];
        double[] var12 = var13;
        double[] var11 = var12;
        double[] var3 = var11;
        ((th) this).field_ab.a((byte) 42, var13);
        double var4 = var13[9];
        int var6 = -29 / ((param1 - -2) / 62);
        double var7 = var13[10];
        double var9 = var13[11];
        ((th) this).field_db.field_t = ((th) this).field_E - var4 * ((th) this).field_C;
        ((th) this).field_db.field_o = ((th) this).field_t - ((th) this).field_C * var7;
        ((th) this).field_db.field_u = 15.0;
        ((th) this).field_db.field_m = -var4;
        ((th) this).field_db.field_x = -var7;
        ((th) this).field_db.field_w = true;
        ((th) this).field_db.field_v = -var9;
        ((th) this).field_db.field_p = ((th) this).field_D - ((th) this).field_C * var9;
        param0.a((rk) (Object) ((th) this).field_db, (byte) 125);
    }

    final void g(int param0) {
        if (param0 != 26402) {
          field_fb = null;
          fl.a(((th) this).a(param0 + -28786, bn.field_b, 1.5, 0.002, 0.5), 4);
          return;
        } else {
          fl.a(((th) this).a(param0 + -28786, bn.field_b, 1.5, 0.002, 0.5), 4);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_fb = "Name is available";
        field_cb = false;
    }
}
