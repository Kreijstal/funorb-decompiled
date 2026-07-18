/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends da {
    int field_B;
    int field_t;
    int field_J;
    int field_i;
    static int[] field_s;
    int field_u;
    nc field_K;
    int field_F;
    fb field_q;
    int field_w;
    static java.awt.Color field_l;
    int field_p;
    static eg field_H;
    fe field_k;
    int field_y;
    int field_m;
    int field_G;
    int field_o;
    int field_D;
    int field_z;
    int field_v;
    static int[] field_n;
    int field_A;
    ab field_I;
    int field_x;
    static boolean[][] field_r;
    static ka field_j;
    static int[][] field_C;
    static String field_E;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int[] param12, int param13, int param14, int param15, int param16) {
        int var42 = 0;
        L0: {
          var42 = TorChallenge.field_F ? 1 : 0;
          if (param15 < 0) {
            break L0;
          } else {
            if (oc.field_e <= param7) {
              break L0;
            } else {
              L1: {
                if (param1 >= 0) {
                  break L1;
                } else {
                  if (param5 >= 0) {
                    break L1;
                  } else {
                    if (0 <= param4) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (oc.field_d > param1) {
                  break L2;
                } else {
                  if (oc.field_d > param5) {
                    break L2;
                  } else {
                    if (oc.field_d <= param4) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0) {
        ((dl) this).field_I = null;
        ((dl) this).field_K = null;
        ((dl) this).field_q = null;
        if (param0 != 1047574608) {
            ((dl) this).field_F = -19;
        }
        ((dl) this).field_k = null;
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = ji.field_r.a(-2, param0, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("dl.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + false + ')');
        }
        return stackIn_3_0;
    }

    final static String[] a(String param0, char param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        Object stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param2 < -17) {
              var10 = (CharSequence) (Object) param0;
              var3_int = w.a(-15, var10, param1);
              var4 = new String[var3_int + 1];
              var5 = 0;
              var6 = 0;
              var7 = 0;
              L1: while (true) {
                if (var3_int <= var7) {
                  var4[var3_int] = param0.substring(var6);
                  stackOut_10_0 = (String[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  var8 = var6;
                  L2: while (true) {
                    if (param0.charAt(var8) == param1) {
                      int incrementValue$2 = var5;
                      var5++;
                      var4[incrementValue$2] = param0.substring(var6, var8);
                      var6 = var8 + 1;
                      var7++;
                      continue L1;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("dl.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    public static void b(boolean param0) {
        field_C = null;
        field_j = null;
        field_l = null;
        field_n = null;
        field_H = null;
        field_s = null;
        field_E = null;
        field_r = null;
    }

    dl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[3];
        field_l = new java.awt.Color(10040319);
        field_C = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[1], new int[1]};
        field_r = new boolean[][]{new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[1], new boolean[1]};
        field_E = "Tor Challenge";
    }
}
