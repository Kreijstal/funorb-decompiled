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
        if (param0 != 6) {
            return;
        }
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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 16) {
          L0: {
            db.b((byte) 58, 113);
            if (ao.field_Kb != cb.field_c) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ao.field_Kb != cb.field_c) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean b(byte param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        if (param1 == -1) {
          return true;
        } else {
          if (param0 != 13) {
            L0: {
              db.a((byte) 49, 53);
              if ((1 << param1 & la.field_g) == 0) {
                stackIn_11_0 = 0;
                break L0;
              } else {
                stackIn_11_0 = 1;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              if ((1 << param1 & la.field_g) == 0) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                stackIn_7_0 = 1;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final static String a(eh param0, String param1, byte param2, String param3) {
        RuntimeException var4 = null;
        String var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.c(0)) {
              L1: {
                if (param2 <= -36) {
                  break L1;
                } else {
                  var5 = (String) null;
                  db.a((eh) null, (String) null, (byte) 85, (String) null);
                  break L1;
                }
              }
              stackIn_6_0 = param1 + " - " + param0.a(-2677) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) (param3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("db.E(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static lk a(long param0, boolean param1) {
        if (param1) {
            db.a((byte) 12, 38);
            return (lk) ((Object) ti.field_i.a(param0, (byte) -9));
        }
        return (lk) ((Object) ti.field_i.a(param0, (byte) -9));
    }

    db() {
        this.field_g = new byte[4096];
        this.field_H = new int[257];
        this.field_m = new int[6];
        this.field_a = new boolean[256];
        this.field_n = 0;
        this.field_F = new int[6][258];
        this.field_s = new int[6][258];
        this.field_c = new byte[6][258];
        this.field_K = new byte[18002];
        this.field_t = new boolean[16];
        this.field_d = new byte[18002];
        this.field_p = 0;
        this.field_w = new int[16];
        this.field_I = new byte[256];
        this.field_C = new int[6][258];
        this.field_u = new int[256];
    }

    static {
        field_f = "Report <%0> for abuse";
        field_z = new lc(2, 4, 4, 0);
    }
}
