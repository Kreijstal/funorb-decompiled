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
        super(0, null);
        hd dupTemp$0 = null;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        up stackIn_3_2 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        L0: {
          stackIn_2_0 = this;

          stackIn_2_1 = 21;

          if (param0.e(-73).c(-2)) {
            stackIn_3_0 = this;
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = null;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = param0.e(-128);
            break L0;
          }
        }
        try {
          L1: {
            L2: {
              stackIn_6_0 = this;

              if (!param1) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            ((bm) (this)).field_G = stackIn_7_1 != 0;
            this.field_J = param0;
            var6 = qp.a(this.field_J.f((byte) 37), false, this.field_J.b(6));
            this.a(var6, this.field_t, this.field_D, -87, this.field_u);
            dupTemp$0 = this.field_i[0];
            dupTemp$0.field_s = dupTemp$0.field_s - 30;
            var4 = pg.a(false, 21)[1];
            var5 = 20 + un.field_d.a(var4);
            this.field_i[1] = eo.a(var4, 7126504, un.field_d, var5, false);
            this.field_i[1].field_J = this.field_i[0].field_J;
            this.field_i[1].field_s = this.field_i[0].field_s + (this.field_i[0].field_q - -20);
            break L1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("bm.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param0 >= 60) {
          super.a(62, param1);
          if (!la.a(100)) {
            if (!this.field_G) {
              L0: {
                ce.field_K.a(this.field_J, 3);
                ((wf) ((Object) rn.a(-104, 16))).field_H = -1L;
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
                this.field_J.a(or.field_d, 5);
                ce.field_K.a(this.field_J, 3);
                ((wf) ((Object) rn.a(-104, 16))).field_H = -1L;
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
              ce.field_K.a(this.field_J, 3);
              ((wf) ((Object) rn.a(-104, 16))).field_H = -1L;
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
        int var0 = 0;
        field_L = new kc[7];
        for (var0 = 0; -8 < (var0 ^ -1); var0++) {
            field_L[var0] = new kc(256);
        }
        field_K = "Waiting to receive the game state...";
        field_H = new r();
        field_F = "Find opponents";
    }
}
