/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ra extends kna {
    static String field_G;
    static int[] field_F;
    private gea field_K;
    static long field_L;
    static String field_H;
    private int field_J;
    private boolean field_I;

    final void a(la param0, int param1) {
        super.a(param0, param1);
        ((ra) this).field_K.a(true);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        tga.field_a.a(param2, param5, param3, param0, fm.a(param4, param1), (byte) -128);
    }

    abstract boolean C(int param0);

    public static void B(int param0) {
        field_G = null;
        field_F = null;
        int var1 = 62 % ((param0 - 26) / 38);
        field_H = null;
    }

    ra(la param0, int param1) {
        super(param0, param1);
        ((ra) this).field_K = new gea();
        ((ra) this).field_J = 131072;
        ((ra) this).field_I = true;
    }

    final ro a(byte param0, la param1, boolean param2) {
        ro var4 = null;
        int var5 = 0;
        gea stackIn_2_0 = null;
        gea stackIn_3_0 = null;
        gea stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        gea stackOut_1_0 = null;
        gea stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        gea stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        L0: {
          var4 = new ro(param1, param2);
          var5 = 3 / ((param0 - 57) / 63);
          if (!((ra) this).A(-127)) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = ((ra) this).field_K;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((ra) this).field_I) {
                stackOut_3_0 = (gea) (Object) stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = (gea) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((gea) (Object) stackIn_4_0).a(stackIn_4_1 != 0, 1);
            break L0;
          }
        }
        if (((ra) this).C(1760)) {
          var4.a((byte) -99, ((ra) this).field_J);
          var4.a(99, ((ra) this).field_K);
          return var4;
        } else {
          var4.a(99, ((ra) this).field_K);
          return var4;
        }
    }

    abstract boolean A(int param0);

    ra(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((ra) this).field_K = new gea();
        ((ra) this).field_J = 131072;
        ((ra) this).field_I = true;
        ((ra) this).field_K = new gea(param0.field_E, param2);
        if (((ra) this).A(-97)) {
            ((ra) this).field_I = -2 == (param2.b((byte) 44, 1) ^ -1) ? true : false;
        }
        if (((ra) this).C(1760)) {
            ((ra) this).field_J = ji.a(param2.b((byte) 44, 8), 107, 4);
        }
    }

    final static String r(byte param0) {
        if (!(fna.field_k != null)) {
            return "";
        }
        int var1 = 69 / ((param0 - 0) / 33);
        return fna.field_k;
    }

    void a(boolean param0, kh param1) {
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        L0: {
          super.a(param0, param1);
          ((ra) this).field_K.a(param1, 0);
          if (!((ra) this).A(64)) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = (kh) param1;
              stackOut_1_1 = 118;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (((ra) this).field_I) {
                stackOut_3_0 = (kh) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (kh) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            ((kh) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2, 1);
            break L0;
          }
        }
        if (!param0) {
          if (((ra) this).C(1760)) {
            param1.a((byte) 103, wma.a((byte) 8, 4, ((ra) this).field_J), 8);
            return;
          } else {
            return;
          }
        } else {
          ((ra) this).field_J = -18;
          if (!((ra) this).C(1760)) {
            return;
          } else {
            param1.a((byte) 103, wma.a((byte) 8, 4, ((ra) this).field_J), 8);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Elapsed time";
        field_F = new int[]{0, 28};
        field_H = "OFF";
    }
}
