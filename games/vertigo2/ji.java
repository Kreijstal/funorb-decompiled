/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ji extends li {
    boolean field_o;
    int field_t;
    static String field_q;
    static cr field_s;
    static aa field_n;
    static fe field_p;
    kk field_v;
    static char field_r;
    aq field_x;
    ji[] field_u;
    static String field_w;

    void a(int param0) {
        if (param0 >= -98) {
            ji.a(false);
        }
    }

    final int[][] c(int param0, int param1, int param2) {
        int[] var4 = null;
        int[][] var5 = null;
        int[] var6 = null;
        if (param1 == 3) {
          if (((ji) this).field_u[param0].field_o) {
            var6 = ((ji) this).field_u[param0].c(param2, param1 ^ 110);
            var4 = var6;
            var5 = new int[3][];
            var5[1] = var6;
            var5[2] = var6;
            var5[0] = var6;
            return var5;
          } else {
            return ((ji) this).field_u[param0].b(-3780, param2);
          }
        } else {
          return null;
        }
    }

    int e(int param0) {
        if (param0 != 6557) {
            int[] discarded$0 = ((ji) this).c(-13, -120);
            return -1;
        }
        return -1;
    }

    void f(int param0) {
        if (!((ji) this).field_o) {
          ((ji) this).field_v.b(32764);
          ((ji) this).field_v = null;
          if (param0 == 2) {
            return;
          } else {
            int[][] discarded$4 = ((ji) this).b(109, -49);
            return;
          }
        } else {
          ((ji) this).field_x.a(false);
          ((ji) this).field_x = null;
          if (param0 == 2) {
            return;
          } else {
            int[][] discarded$5 = ((ji) this).b(109, -49);
            return;
          }
        }
    }

    int[] c(int param0, int param1) {
        if (param1 <= 91) {
            return null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_w = null;
        field_n = null;
        field_s = null;
        field_p = null;
        field_q = null;
    }

    final int[] a(int param0, int param1, int param2) {
        if (param1 == -1) {
          if (((ji) this).field_u[param0].field_o) {
            return ((ji) this).field_u[param0].c(param2, 102);
          } else {
            return ((ji) this).field_u[param0].b(param1 + -3779, param2)[0];
          }
        } else {
          ((ji) this).field_o = false;
          if (((ji) this).field_u[param0].field_o) {
            return ((ji) this).field_u[param0].c(param2, 102);
          } else {
            return ((ji) this).field_u[param0].b(param1 + -3779, param2)[0];
          }
        }
    }

    int[][] b(int param0, int param1) {
        if (param0 != -3780) {
            return null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    int a(byte param0) {
        if (param0 != -117) {
            ((ji) this).a(-71);
            return -1;
        }
        return -1;
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (param2 == ((ji) this).field_t) {
            stackOut_2_0 = param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((ji) this).field_t;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (((ji) this).field_o) {
          ((ji) this).field_x = new aq(var4, param0, param1);
          return;
        } else {
          ((ji) this).field_v = new kk(var4, param0, param1);
          return;
        }
    }

    ji(int param0, boolean param1) {
        ((ji) this).field_u = new ji[param0];
        ((ji) this).field_o = param1 ? true : false;
    }

    void a(byte param0, int param1, ed param2) {
        if (param0 != 110) {
            ((ji) this).field_t = 59;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Private";
        field_w = "<col=ee9d32>How to play Vertigo 2</col>";
    }
}
