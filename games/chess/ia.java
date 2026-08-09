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
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
                  discarded$0 = var9.append(param2.substring(var10, var11));
                  discarded$1 = var9.append(param1);
                  var10 = var11 - -var5;
                  continue L4;
                } else {
                  discarded$2 = var9.append(param2.substring(var10));
                  stackIn_15_0 = var9.toString();
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
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("ia.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), stackIn_25_2 + ',' + param3 + ')');
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
