/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mv {
    private int field_b;
    private int field_h;
    private int field_e;
    private vna field_g;
    private tba[] field_f;
    static int field_i;
    private int field_c;
    private int[][] field_a;
    boolean field_d;

    final int[] a(byte param0, int param1) {
        int var3 = 0;
        tba var4 = null;
        tba var4_ref = null;
        tba var5 = null;
        tba var5_ref = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 8 % ((param0 - -43) / 59);
        if (((mv) this).field_e != ((mv) this).field_b) {
          if (1 != ((mv) this).field_e) {
            L0: {
              var4 = ((mv) this).field_f[param1];
              var5 = var4;
              var5 = var4;
              if (var4 == null) {
                L1: {
                  ((mv) this).field_d = true;
                  if (((mv) this).field_c < ((mv) this).field_e) {
                    var4_ref = new tba(param1, ((mv) this).field_c);
                    ((mv) this).field_c = ((mv) this).field_c + 1;
                    break L1;
                  } else {
                    var5_ref = (tba) (Object) ((mv) this).field_g.b(3);
                    var4_ref = new tba(param1, var5_ref.field_j);
                    ((mv) this).field_f[var5_ref.field_h] = null;
                    var5_ref.p(69);
                    break L1;
                  }
                }
                ((mv) this).field_f[param1] = var4_ref;
                break L0;
              } else {
                ((mv) this).field_d = false;
                break L0;
              }
            }
            ((mv) this).field_g.a((byte) 103, (vg) (Object) var4_ref);
            return ((mv) this).field_a[var4_ref.field_j];
          } else {
            L2: {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (param1 == ((mv) this).field_h) {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L2;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L2;
              }
            }
            ((mv) this).field_d = stackIn_9_1 != 0;
            ((mv) this).field_h = param1;
            return ((mv) this).field_a[0];
          }
        } else {
          L3: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (((mv) this).field_f[param1] != null) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L3;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L3;
            }
          }
          ((mv) this).field_d = stackIn_4_1 != 0;
          ((mv) this).field_f[param1] = nea.field_a;
          return ((mv) this).field_a[param1];
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < ((mv) this).field_e; var2++) {
            ((mv) this).field_a[var2] = null;
        }
        ((mv) this).field_a = null;
        ((mv) this).field_f = null;
        ((mv) this).field_g.d(8);
        ((mv) this).field_g = null;
        if (param0) {
            ((mv) this).a(true);
        }
    }

    final int[][] a(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(((mv) this).field_e == ((mv) this).field_b)) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = param0; var2 < ((mv) this).field_e; var2++) {
            ((mv) this).field_f[var2] = nea.field_a;
        }
        return ((mv) this).field_a;
    }

    mv(int param0, int param1, int param2) {
        ((mv) this).field_h = -1;
        ((mv) this).field_c = 0;
        ((mv) this).field_g = new vna();
        ((mv) this).field_d = false;
        ((mv) this).field_e = param0;
        ((mv) this).field_b = param1;
        ((mv) this).field_a = new int[((mv) this).field_e][param2];
        ((mv) this).field_f = new tba[((mv) this).field_b];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 35;
    }
}
