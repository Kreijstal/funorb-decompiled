/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq {
    static String field_f;
    private int[][] field_k;
    private int field_e;
    private int field_a;
    private fd[] field_c;
    static int[] field_d;
    private int field_g;
    static String field_b;
    private nj field_j;
    private int field_h;
    boolean field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        L0: {
          if (param5 < ap.field_e) {
            el.a(param1, (byte) -124, param2, param5, param0, param4, param7, param3);
            break L0;
          } else {
            if (ib.field_a < param0) {
              el.a(param1, (byte) -124, param2, param5, param0, param4, param7, param3);
              break L0;
            } else {
              if (param7 < ua.field_e) {
                el.a(param1, (byte) -124, param2, param5, param0, param4, param7, param3);
                break L0;
              } else {
                if (cj.field_D < param4) {
                  el.a(param1, (byte) -124, param2, param5, param0, param4, param7, param3);
                  break L0;
                } else {
                  fn.a(param0, param5, param7, param4, param1, (byte) -11, param2, param3);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param6 == 0) {
            break L1;
          } else {
            aq.a(-63, 66, 94, 110, -117, 90, -38, -16);
            break L1;
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = 0; var2 < ((aq) this).field_h; var2++) {
            ((aq) this).field_k[var2] = null;
        }
        ((aq) this).field_c = null;
        if (param0) {
            ((aq) this).field_g = 40;
        }
        ((aq) this).field_k = null;
        ((aq) this).field_j.c(0);
        ((aq) this).field_j = null;
    }

    final int[] a(int param0, byte param1) {
        int var3 = 0;
        fd var4 = null;
        fd var4_ref = null;
        fd var5 = null;
        fd var5_ref = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        var3 = 28 % ((param1 - 6) / 48);
        if (((aq) this).field_h != ((aq) this).field_g) {
          if (-2 == (((aq) this).field_h ^ -1)) {
            L0: {
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (((aq) this).field_a == param0) {
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
            ((aq) this).field_i = stackIn_16_1 != 0;
            ((aq) this).field_a = param0;
            return ((aq) this).field_k[0];
          } else {
            L1: {
              var4 = ((aq) this).field_c[param0];
              var5 = var4;
              var5 = var4;
              if (var4 != null) {
                ((aq) this).field_i = false;
                break L1;
              } else {
                L2: {
                  ((aq) this).field_i = true;
                  if (((aq) this).field_h <= ((aq) this).field_e) {
                    var5_ref = (fd) (Object) ((aq) this).field_j.c((byte) -127);
                    var4_ref = new fd(param0, var5_ref.field_n);
                    ((aq) this).field_c[var5_ref.field_r] = null;
                    var5_ref.c(2);
                    break L2;
                  } else {
                    var4_ref = new fd(param0, ((aq) this).field_e);
                    ((aq) this).field_e = ((aq) this).field_e + 1;
                    break L2;
                  }
                }
                ((aq) this).field_c[param0] = var4_ref;
                break L1;
              }
            }
            ((aq) this).field_j.a((li) (Object) var4_ref, (byte) 27);
            return ((aq) this).field_k[var4_ref.field_n];
          }
        } else {
          L3: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (null != ((aq) this).field_c[param0]) {
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
          ((aq) this).field_i = stackIn_4_1 != 0;
          ((aq) this).field_c[param0] = nb.field_F;
          return ((aq) this).field_k[param0];
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_d = null;
        field_f = null;
        if (param0 > -80) {
            aq.b(79);
        }
    }

    final static void a(mp param0, byte param1, int param2, int param3) {
        int var4 = 57 / ((param1 - -27) / 53);
    }

    final int[][] a(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 100) {
            ((aq) this).field_j = null;
        }
        if (((aq) this).field_h != ((aq) this).field_g) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = 0; var2 < ((aq) this).field_h; var2++) {
            ((aq) this).field_c[var2] = nb.field_F;
        }
        return ((aq) this).field_k;
    }

    aq(int param0, int param1, int param2) {
        ((aq) this).field_e = 0;
        ((aq) this).field_a = -1;
        ((aq) this).field_j = new nj();
        ((aq) this).field_i = false;
        ((aq) this).field_h = param0;
        ((aq) this).field_g = param1;
        ((aq) this).field_c = new fd[((aq) this).field_g];
        ((aq) this).field_k = new int[((aq) this).field_h][param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{100, 100, 200, 300, 200, 300, 300, 500, 300, 1000, 300, 300, 200};
        field_b = "Decline invitation to <%0>'s game";
        field_f = "Offline";
    }
}
