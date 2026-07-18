/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    int[] field_H;
    int[] field_c;
    int field_z;
    int field_t;
    int field_v;
    int field_o;
    boolean[] field_C;
    int[][] field_r;
    byte[] field_y;
    int field_A;
    static int[] field_q;
    static boolean field_n;
    static oh field_F;
    byte[] field_J;
    int field_I;
    int[] field_m;
    int field_K;
    int field_u;
    byte[] field_i;
    boolean[] field_B;
    static v field_x;
    int field_a;
    int field_d;
    int field_G;
    int field_k;
    int[] field_D;
    int field_s;
    static String field_b;
    byte[] field_w;
    int[][] field_p;
    byte[][] field_h;
    int field_E;
    int field_f;
    byte[] field_g;
    int[][] field_e;
    byte[] field_j;
    byte field_l;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        var4 = TetraLink.field_J;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (1 >= param2) {
                    break L3;
                  } else {
                    stackOut_3_0 = -1;
                    stackOut_3_1 = ~(1 & param2);
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_10_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == stackIn_4_1) {
                          break L4;
                        } else {
                          var3_int = var3_int * param0;
                          break L4;
                        }
                      }
                      param0 = param0 * param0;
                      param2 = param2 >> 1;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackOut_9_1 = param2;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L2;
              }
              if (stackIn_10_0 != stackIn_10_1) {
                if (param1 >= 80) {
                  stackOut_16_0 = var3_int;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_14_0 = -51;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                }
              } else {
                stackOut_11_0 = param0 * var3_int;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "cm.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    public static void b(byte param0) {
        field_F = null;
        field_q = null;
        if (param0 <= 8) {
            return;
        }
        try {
            field_b = null;
            field_x = null;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "cm.A(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 > -111) {
            return;
        }
        try {
            sj.field_g = new nd(sa.field_h, hl.field_gb, sn.field_c, bk.field_i, (hl) (Object) vd.field_c, ek.field_n);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "cm.C(" + param0 + ')');
        }
    }

    cm() {
        ((cm) this).field_c = new int[16];
        ((cm) this).field_H = new int[256];
        ((cm) this).field_r = new int[6][258];
        ((cm) this).field_t = 0;
        ((cm) this).field_y = new byte[4096];
        ((cm) this).field_o = 0;
        ((cm) this).field_m = new int[257];
        ((cm) this).field_C = new boolean[16];
        ((cm) this).field_D = new int[6];
        ((cm) this).field_B = new boolean[256];
        ((cm) this).field_p = new int[6][258];
        ((cm) this).field_w = new byte[256];
        ((cm) this).field_h = new byte[6][258];
        ((cm) this).field_e = new int[6][258];
        ((cm) this).field_g = new byte[18002];
        ((cm) this).field_j = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = null;
        field_b = "Accept invitation to <%0>'s game";
    }
}
