/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends pf {
    static ko field_k;
    static String field_h;
    private java.nio.ByteBuffer field_f;
    static String field_l;
    static ut field_g;
    static cn field_o;
    static int[] field_j;
    static int field_i;
    static ut field_m;
    static ut field_n;

    final static void c(byte param0) {
        ma.k((byte) -118);
        int var1 = 115 % ((param0 - -48) / 42);
        ae.m(-19417);
    }

    public static void b(byte param0) {
        field_m = null;
        field_l = null;
        field_h = null;
        field_n = null;
        field_j = null;
        field_o = null;
        field_k = null;
        if (param0 > -47) {
          ll.b((byte) 81);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final void a(byte[] param0, int param1) {
        ((ll) this).field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$12 = ((ll) this).field_f.position(0);
        java.nio.ByteBuffer discarded$19 = ((ll) this).field_f.put(param0);
        if (param1 != 21820) {
            ll.b((byte) -82);
        }
    }

    final byte[] a(int param0) {
        byte[] var2 = null;
        Object var3 = null;
        byte[] var4 = null;
        if (param0 != 2) {
          var3 = null;
          int discarded$10 = ll.a((int[][][]) null, -84, 70, (ea) null, 83);
          var4 = new byte[((ll) this).field_f.capacity()];
          var2 = var4;
          java.nio.Buffer discarded$11 = ((ll) this).field_f.position(0);
          java.nio.ByteBuffer discarded$12 = ((ll) this).field_f.get(var4);
          return var4;
        } else {
          var4 = new byte[((ll) this).field_f.capacity()];
          var2 = var4;
          java.nio.Buffer discarded$13 = ((ll) this).field_f.position(0);
          java.nio.ByteBuffer discarded$14 = ((ll) this).field_f.get(var4);
          return var4;
        }
    }

    ll() {
    }

    final static int a(int[][][] param0, int param1, int param2, ea param3, int param4) {
        if (-3 == (param2 ^ -1)) {
          return param0[param4][param3.field_i][param3.field_k] + (-param0[param4][param3.field_i][param3.field_e] + (-param0[param4][param3.field_d][param3.field_k] + param0[param4][param3.field_d][param3.field_e]));
        } else {
          if (param1 > 81) {
            if (param2 != 1) {
              if (param2 == 0) {
                return param0[param3.field_c][param3.field_i][param4] + (-param0[param3.field_l][param3.field_i][param4] + param0[param3.field_l][param3.field_d][param4]) - param0[param3.field_c][param3.field_d][param4];
              } else {
                return 0;
              }
            } else {
              return param0[param3.field_c][param4][param3.field_k] + (-param0[param3.field_c][param4][param3.field_e] + -param0[param3.field_l][param4][param3.field_k]) + param0[param3.field_l][param4][param3.field_e];
            }
          } else {
            field_m = null;
            if (param2 != 1) {
              if (param2 == 0) {
                return param0[param3.field_c][param3.field_i][param4] + (-param0[param3.field_l][param3.field_i][param4] + param0[param3.field_l][param3.field_d][param4]) - param0[param3.field_c][param3.field_d][param4];
              } else {
                return 0;
              }
            } else {
              return param0[param3.field_c][param4][param3.field_k] + (-param0[param3.field_c][param4][param3.field_e] + -param0[param3.field_l][param4][param3.field_k]) + param0[param3.field_l][param4][param3.field_e];
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Please try changing the following settings:  ";
        field_k = new ko(1);
        field_l = "Up to 16 players compete in <col=ffff00>1 vs 1 games</col> to be the ultimate winner in a <col=ffff00>knockout competition.</col>";
        field_j = new int[4];
        field_i = -1;
    }
}
