/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    private dq[] field_k;
    static it field_d;
    private int field_g;
    private int field_c;
    private int field_e;
    static int field_b;
    private vna field_h;
    private int[][][] field_a;
    static String field_j;
    private int field_i;
    boolean field_f;

    final int[][][] a(byte param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = -59 % ((param0 - 3) / 52);
        if (!(((fk) this).field_c == ((fk) this).field_e)) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var3 = 0; var3 < ((fk) this).field_e; var3++) {
            ((fk) this).field_k[var3] = ioa.field_n;
        }
        return ((fk) this).field_a;
    }

    final int[][] a(int param0, byte param1) {
        int var3 = 0;
        dq var4 = null;
        dq var4_ref = null;
        dq var5 = null;
        dq var5_ref = null;
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
        var3 = 89 / ((param1 - 61) / 38);
        if (((fk) this).field_c != ((fk) this).field_e) {
          if ((((fk) this).field_e ^ -1) != -2) {
            L0: {
              var4 = ((fk) this).field_k[param0];
              var5 = var4;
              var5 = var4;
              if (var4 == null) {
                L1: {
                  ((fk) this).field_f = true;
                  if (((fk) this).field_g < ((fk) this).field_e) {
                    var4_ref = new dq(param0, ((fk) this).field_g);
                    ((fk) this).field_g = ((fk) this).field_g + 1;
                    break L1;
                  } else {
                    var5_ref = (dq) (Object) ((fk) this).field_h.b(3);
                    var4_ref = new dq(param0, var5_ref.field_g);
                    ((fk) this).field_k[var5_ref.field_i] = null;
                    var5_ref.p(63);
                    break L1;
                  }
                }
                ((fk) this).field_k[param0] = var4_ref;
                break L0;
              } else {
                ((fk) this).field_f = false;
                break L0;
              }
            }
            ((fk) this).field_h.a((byte) 116, (vg) (Object) var4_ref);
            return ((fk) this).field_a[var4_ref.field_g];
          } else {
            L2: {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (((fk) this).field_i == param0) {
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
            ((fk) this).field_f = stackIn_9_1 != 0;
            ((fk) this).field_i = param0;
            return ((fk) this).field_a[0];
          }
        } else {
          L3: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (((fk) this).field_k[param0] != null) {
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
          ((fk) this).field_f = stackIn_4_1 != 0;
          ((fk) this).field_k[param0] = ioa.field_n;
          return ((fk) this).field_a[param0];
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          var3 = 0;
          if (param1 == -113) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        var4 = wp.field_b;
        L1: while (true) {
          if (cna.field_b.length <= var3) {
            return -1;
          } else {
            var5 = f.field_c[var3];
            if (var5 >= 0) {
              var6 = apa.a((byte) -50, true, cna.field_b[var3]);
              var7 = gda.field_a + -(var6 >> 1065113793);
              var4 = var4 + aqa.field_a;
              if (!rea.a(param2, var6 + (vra.field_a << 1973548385), var7 + -vra.field_a, param0, am.field_n - -(vf.field_d << -611719359), false, var4)) {
                var4 = var4 + ((vf.field_d << 541864929) + (aqa.field_a + am.field_n));
                var3++;
                continue L1;
              } else {
                return var5;
              }
            } else {
              var4 = var4 + uda.field_x;
              var3++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        if (param0 != 2) {
            int[][][] discarded$0 = ((fk) this).a((byte) 23);
        }
        while (var2 < ((fk) this).field_e) {
            ((fk) this).field_a[var2][0] = null;
            ((fk) this).field_a[var2][1] = null;
            ((fk) this).field_a[var2][2] = null;
            ((fk) this).field_a[var2] = null;
            var2++;
        }
        ((fk) this).field_a = null;
        ((fk) this).field_k = null;
        ((fk) this).field_h.d(8);
        ((fk) this).field_h = null;
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 >= -101) {
            return;
        }
        field_d = null;
    }

    fk(int param0, int param1, int param2) {
        ((fk) this).field_g = 0;
        ((fk) this).field_i = -1;
        ((fk) this).field_h = new vna();
        ((fk) this).field_f = false;
        ((fk) this).field_c = param1;
        ((fk) this).field_e = param0;
        ((fk) this).field_a = new int[((fk) this).field_e][3][param2];
        ((fk) this).field_k = new dq[((fk) this).field_c];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "The temple door creaks open... <br>Use <img=4><img=7><img=6><img=5> or <img=0><img=1><img=2><img=3> to reach the chamber exit to the north.";
        field_d = new it();
    }
}
