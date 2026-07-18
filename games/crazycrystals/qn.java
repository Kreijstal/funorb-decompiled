/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qn {
    byte field_f;
    int[] field_K;
    int[][] field_l;
    byte[] field_A;
    int[] field_o;
    static dl field_e;
    int field_h;
    int field_s;
    int[][] field_x;
    int field_L;
    int field_k;
    int field_J;
    byte[] field_i;
    int[] field_D;
    byte[][] field_d;
    int field_t;
    byte[] field_q;
    int field_O;
    int field_G;
    int field_b;
    byte[] field_M;
    int[][] field_F;
    boolean[] field_y;
    int field_I;
    static int field_n;
    static sj field_g;
    boolean[] field_p;
    int field_m;
    byte[] field_H;
    int field_a;
    int field_B;
    static String field_C;
    static int field_u;
    static String field_z;
    int field_w;
    int field_r;
    static String field_j;
    byte[] field_c;
    int[] field_v;
    static String[] field_E;

    public static void a(int param0) {
        field_z = null;
        field_g = null;
        field_C = null;
        field_E = null;
        if (param0 != 258) {
            return;
        }
        try {
            field_e = null;
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "qn.C(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            if (!sl.a(param1, param2, 0)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (param0 <= -82) {
                var3_int = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (param2.length() <= var3_int) {
                        break L3;
                      } else {
                        stackOut_11_0 = oh.a(param2.charAt(var3_int), (byte) 108);
                        stackIn_20_0 = stackOut_11_0 ? 1 : 0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          if (!stackIn_12_0) {
                            stackOut_16_0 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0 != 0;
                          } else {
                            var3_int++;
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_19_0 = 1;
                    stackIn_20_0 = stackOut_19_0;
                    break L2;
                  }
                  break L0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("qn.B(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final static String a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        try {
          L0: {
            var1_int = -53 % ((param0 - -57) / 50);
            stackOut_0_0 = (String) field_z;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "qn.A(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    qn() {
        ((qn) this).field_i = new byte[4096];
        ((qn) this).field_D = new int[16];
        ((qn) this).field_k = 0;
        ((qn) this).field_A = new byte[18002];
        ((qn) this).field_d = new byte[6][258];
        ((qn) this).field_p = new boolean[256];
        ((qn) this).field_K = new int[257];
        ((qn) this).field_y = new boolean[16];
        ((qn) this).field_x = new int[6][258];
        ((qn) this).field_F = new int[6][258];
        ((qn) this).field_l = new int[6][258];
        ((qn) this).field_o = new int[256];
        ((qn) this).field_H = new byte[256];
        ((qn) this).field_b = 0;
        ((qn) this).field_v = new int[6];
        ((qn) this).field_c = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new sj(7, 0, 1, 1);
        field_C = "From only <%0>/month";
        field_u = -1;
        field_z = null;
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_E = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
