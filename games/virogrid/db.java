/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    int field_J;
    int field_E;
    int field_L;
    byte field_G;
    int field_r;
    byte[] field_g;
    int field_e;
    int[] field_w;
    byte[] field_d;
    int[] field_H;
    int field_A;
    int[][] field_F;
    int field_l;
    int[] field_m;
    static String field_f;
    byte[] field_i;
    int field_j;
    int field_n;
    int field_p;
    boolean[] field_t;
    int field_o;
    int field_y;
    static int field_D;
    boolean[] field_a;
    byte[] field_q;
    byte[] field_K;
    int field_x;
    static lc field_z;
    int field_b;
    int[][] field_s;
    static int[] field_k;
    static v field_h;
    byte[][] field_c;
    byte[] field_I;
    static int field_v;
    int[][] field_C;
    int[] field_u;
    int field_B;

    public static void a(int param0) {
        field_k = null;
        field_h = null;
        field_f = null;
        field_z = null;
    }

    final static void a(byte param0, int param1) {
        qh.field_K = 0;
        nb.field_s = param1;
        hf.field_D = new int[3];
        el.field_s = new cj[15 * param1];
        if (param0 < 33) {
            field_v = -82;
        }
    }

    final static boolean b(int param0) {
        return ao.field_Kb == cb.field_c;
    }

    final static boolean b(byte param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == -1) {
          return true;
        } else {
          if (param0 != 13) {
            L0: {
              db.a((byte) 49, 53);
              if ((1 << param1 & la.field_g) == 0) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              if ((1 << param1 & la.field_g) == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final static String a(eh param0, String param1, byte param2, String param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param0.c(0)) {
              L1: {
                if (param2 <= -36) {
                  break L1;
                } else {
                  var5 = null;
                  String discarded$2 = db.a((eh) null, (String) null, (byte) 85, (String) null);
                  break L1;
                }
              }
              stackOut_5_0 = param1 + " - " + param0.a(-2677) + "%";
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = (String) param3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("db.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_6_0;
    }

    final static lk a(long param0, boolean param1) {
        return (lk) (Object) ti.field_i.a(param0, (byte) -9);
    }

    db() {
        ((db) this).field_g = new byte[4096];
        ((db) this).field_H = new int[257];
        ((db) this).field_m = new int[6];
        ((db) this).field_a = new boolean[256];
        ((db) this).field_n = 0;
        ((db) this).field_F = new int[6][258];
        ((db) this).field_s = new int[6][258];
        ((db) this).field_c = new byte[6][258];
        ((db) this).field_K = new byte[18002];
        ((db) this).field_t = new boolean[16];
        ((db) this).field_d = new byte[18002];
        ((db) this).field_p = 0;
        ((db) this).field_w = new int[16];
        ((db) this).field_I = new byte[256];
        ((db) this).field_C = new int[6][258];
        ((db) this).field_u = new int[256];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Report <%0> for abuse";
        field_z = new lc(2, 4, 4, 0);
    }
}
