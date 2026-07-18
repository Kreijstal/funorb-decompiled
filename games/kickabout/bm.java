/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends i {
    static kc[] field_L;
    pt field_J;
    static String field_K;
    private boolean field_G;
    static int field_I;
    static r field_H;
    static String field_F;

    bm(pt param0, boolean param1) {
        super(21, (lv) null);
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        Object stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        up stackIn_3_2 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_2_2 = null;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        up stackOut_1_2 = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        L0: {
          stackOut_0_0 = this;
          stackOut_0_1 = 21;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (param0.e(-73).c(-2)) {
            stackOut_2_0 = this;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = null;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = (up) (Object) stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = param0.e(-128);
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        try {
          L1: {
            L2: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param1) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((bm) this).field_G = stackIn_7_1 != 0;
            ((bm) this).field_J = param0;
            var6 = qp.a(((bm) this).field_J.f((byte) 37), false, ((bm) this).field_J.b(6));
            ((bm) this).a(var6, ((bm) this).field_t, ((bm) this).field_D, -87, ((bm) this).field_u);
            ((bm) this).field_i[0].field_s = ((bm) this).field_i[0].field_s - 30;
            var4 = pg.a(false, 21)[1];
            var5 = 20 + un.field_d.a(var4);
            ((bm) this).field_i[1] = eo.a(var4, 7126504, (hu) (Object) un.field_d, var5, false);
            ((bm) this).field_i[1].field_J = ((bm) this).field_i[0].field_J;
            ((bm) this).field_i[1].field_s = ((bm) this).field_i[0].field_s + (((bm) this).field_i[0].field_q - -20);
            break L1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("bm.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param0 >= 60) {
          super.a(62, param1);
          if (!la.a(100)) {
            if (!((bm) this).field_G) {
              L0: {
                ce.field_K.a((gn) (Object) ((bm) this).field_J, 3);
                ((wf) (Object) rn.a(-104, 16)).field_H = -1L;
                if (param1 == 1) {
                  jm.a(16, true, -2);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                or.field_d.b(60, (byte) 104);
                ((bm) this).field_J.a((iw) (Object) or.field_d, 5);
                ce.field_K.a((gn) (Object) ((bm) this).field_J, 3);
                ((wf) (Object) rn.a(-104, 16)).field_H = -1L;
                if (param1 == 1) {
                  jm.a(16, true, -2);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              ce.field_K.a((gn) (Object) ((bm) this).field_J, 3);
              ((wf) (Object) rn.a(-104, 16)).field_H = -1L;
              if (param1 == 1) {
                jm.a(16, true, -2);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
            bm.d(true);
            return 400;
        }
        return 400;
    }

    public static void d(boolean param0) {
        if (param0) {
          bm.d(false);
          field_F = null;
          field_H = null;
          field_L = null;
          field_K = null;
          return;
        } else {
          field_F = null;
          field_H = null;
          field_L = null;
          field_K = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_L = new kc[7];
        for (var0 = 0; var0 < 7; var0++) {
            field_L[var0] = new kc(256);
        }
        field_K = "Waiting to receive the game state...";
        field_H = new r();
        field_F = "Find opponents";
    }
}
