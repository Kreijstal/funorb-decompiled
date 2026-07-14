/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gab {
    private int field_f;
    static String[] field_j;
    private osa[] field_a;
    private int field_c;
    static sfa field_b;
    private int field_d;
    private int field_g;
    private ij field_i;
    private int[][] field_h;
    boolean field_e;

    final int[][] b(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (!(((gab) this).field_g == ((gab) this).field_c)) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = 0; var2 < ((gab) this).field_c; var2++) {
            ((gab) this).field_a[var2] = hgb.field_o;
        }
        if (param0 <= 23) {
            ((gab) this).field_h = null;
        }
        return ((gab) this).field_h;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        for (var2 = 0; var2 < ((gab) this).field_c; var2++) {
            ((gab) this).field_h[var2] = null;
        }
        ((gab) this).field_h = null;
        ((gab) this).field_a = null;
        ((gab) this).field_i.e(100);
        if (param0) {
            int[][] discarded$0 = ((gab) this).b(122);
        }
        ((gab) this).field_i = null;
    }

    public static void a(int param0) {
        if (param0 != 15325) {
            return;
        }
        field_j = null;
        field_b = null;
    }

    final int[] a(byte param0, int param1) {
        int var3 = 0;
        osa var4 = null;
        osa var4_ref = null;
        osa var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        var6 = VoidHunters.field_G;
        var3 = -45 / ((param0 - 80) / 37);
        if (((gab) this).field_c == ((gab) this).field_g) {
          L0: {
            stackOut_13_0 = this;
            stackIn_15_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (null != ((gab) this).field_a[param1]) {
              stackOut_15_0 = this;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L0;
            } else {
              stackOut_14_0 = this;
              stackOut_14_1 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              break L0;
            }
          }
          ((gab) this).field_e = stackIn_16_1 != 0;
          ((gab) this).field_a[param1] = hgb.field_o;
          return ((gab) this).field_h[param1];
        } else {
          if (1 != ((gab) this).field_c) {
            L1: {
              var4 = ((gab) this).field_a[param1];
              if (var4 != null) {
                ((gab) this).field_e = false;
                break L1;
              } else {
                L2: {
                  ((gab) this).field_e = true;
                  if (((gab) this).field_d < ((gab) this).field_c) {
                    var4_ref = new osa(param1, ((gab) this).field_d);
                    ((gab) this).field_d = ((gab) this).field_d + 1;
                    break L2;
                  } else {
                    var5 = (osa) (Object) ((gab) this).field_i.b((byte) 116);
                    var4_ref = new osa(param1, var5.field_f);
                    ((gab) this).field_a[var5.field_d] = null;
                    var5.b(-3846);
                    break L2;
                  }
                }
                ((gab) this).field_a[param1] = var4_ref;
                break L1;
              }
            }
            ((gab) this).field_i.a((ksa) (Object) var4_ref, (byte) -55);
            return ((gab) this).field_h[var4_ref.field_f];
          } else {
            L3: {
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (((gab) this).field_f == param1) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L3;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L3;
              }
            }
            ((gab) this).field_e = stackIn_5_1 != 0;
            ((gab) this).field_f = param1;
            return ((gab) this).field_h[0];
          }
        }
    }

    gab(int param0, int param1, int param2) {
        ((gab) this).field_f = -1;
        ((gab) this).field_d = 0;
        ((gab) this).field_i = new ij();
        ((gab) this).field_e = false;
        ((gab) this).field_g = param1;
        ((gab) this).field_c = param0;
        ((gab) this).field_h = new int[((gab) this).field_c][param2];
        ((gab) this).field_a = new osa[((gab) this).field_g];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{null, null, null, null, "User in singleplayer sandbox"};
        field_b = new sfa();
    }
}
