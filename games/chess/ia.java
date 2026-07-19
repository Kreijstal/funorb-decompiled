/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    int field_y;
    int[] field_b;
    int field_d;
    int[] field_t;
    byte[] field_k;
    static boolean field_l;
    static rk[] field_e;
    int field_F;
    int field_j;
    byte[][] field_c;
    byte[] field_g;
    int[] field_x;
    byte[] field_q;
    int[] field_v;
    int[][] field_I;
    static String field_w;
    byte[] field_D;
    int field_H;
    int field_s;
    boolean[] field_r;
    int field_a;
    static pd field_o;
    int[][] field_n;
    int field_m;
    byte field_A;
    int field_u;
    int field_i;
    int field_E;
    int[][] field_h;
    boolean[] field_f;
    int field_J;
    int field_G;
    int field_B;
    int field_p;
    byte[] field_z;
    byte[] field_C;

    final static void b(byte param0) {
        if (param0 != -72) {
            ia.b((byte) 83);
        }
    }

    final static void a(byte param0) {
        if (param0 > -111) {
            ia.b((byte) -119);
        }
    }

    public static void a(int param0) {
        field_w = null;
        if (param0 != 256) {
            return;
        }
        field_e = null;
        field_o = null;
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var12 = Chess.field_G;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param0.length();
              var6 = param1.length();
              if (param3 == 107) {
                break L1;
              } else {
                field_o = (pd) null;
                break L1;
              }
            }
            if (var5 != 0) {
              L2: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (var8 == 0) {
                  break L2;
                } else {
                  var9_int = 0;
                  L3: while (true) {
                    var9_int = param2.indexOf(param0, var9_int);
                    if ((var9_int ^ -1) <= -1) {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L4: while (true) {
                var11 = param2.indexOf(param0, var10);
                if ((var11 ^ -1) <= -1) {
                  discarded$3 = var9.append(param2.substring(var10, var11));
                  discarded$4 = var9.append(param1);
                  var10 = var11 - -var5;
                  continue L4;
                } else {
                  discarded$5 = var9.append(param2.substring(var10));
                  stackOut_14_0 = var9.toString();
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("ia.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ')');
        }
        return stackIn_15_0;
    }

    ia() {
        this.field_g = new byte[4096];
        this.field_r = new boolean[16];
        this.field_q = new byte[18002];
        this.field_t = new int[6];
        this.field_b = new int[16];
        this.field_I = new int[6][258];
        this.field_n = new int[6][258];
        this.field_v = new int[256];
        this.field_c = new byte[6][258];
        this.field_f = new boolean[256];
        this.field_H = 0;
        this.field_k = new byte[256];
        this.field_x = new int[257];
        this.field_h = new int[6][258];
        this.field_i = 0;
        this.field_z = new byte[18002];
    }

    static {
        field_w = "Who can join";
    }
}
