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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Chess.field_G;
        var4 = param2.length();
        var5 = param0.length();
        var6 = param1.length();
        if (param3 == 107) {
          if (var5 != 0) {
            var7 = var4;
            var8 = -var5 + var6;
            if (var8 == 0) {
              var9 = new StringBuilder(var7);
              var10 = 0;
              L0: while (true) {
                var11 = param2.indexOf(param0, var10);
                if ((var11 ^ -1) <= -1) {
                  StringBuilder discarded$12 = var9.append(param2.substring(var10, var11));
                  StringBuilder discarded$13 = var9.append(param1);
                  var10 = var11 - -var5;
                  continue L0;
                } else {
                  StringBuilder discarded$14 = var9.append(param2.substring(var10));
                  return var9.toString();
                }
              }
            } else {
              var9_int = 0;
              L1: while (true) {
                var9_int = param2.indexOf(param0, var9_int);
                if ((var9_int ^ -1) <= -1) {
                  var7 = var7 + var8;
                  var9_int = var9_int + var5;
                  continue L1;
                } else {
                  var9 = new StringBuilder(var7);
                  var10 = 0;
                  L2: while (true) {
                    var11 = param2.indexOf(param0, var10);
                    if ((var11 ^ -1) <= -1) {
                      StringBuilder discarded$15 = var9.append(param2.substring(var10, var11));
                      StringBuilder discarded$16 = var9.append(param1);
                      var10 = var11 - -var5;
                      continue L2;
                    } else {
                      StringBuilder discarded$17 = var9.append(param2.substring(var10));
                      return var9.toString();
                    }
                  }
                }
              }
            }
          } else {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
        } else {
          field_o = null;
          if (var5 != 0) {
            var7 = var4;
            var8 = -var5 + var6;
            if (var8 == 0) {
              var9 = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param2.indexOf(param0, var10);
                if ((var11 ^ -1) <= -1) {
                  StringBuilder discarded$18 = var9.append(param2.substring(var10, var11));
                  StringBuilder discarded$19 = var9.append(param1);
                  var10 = var11 - -var5;
                  continue L3;
                } else {
                  StringBuilder discarded$20 = var9.append(param2.substring(var10));
                  return var9.toString();
                }
              }
            } else {
              var9_int = 0;
              L4: while (true) {
                var9_int = param2.indexOf(param0, var9_int);
                if ((var9_int ^ -1) <= -1) {
                  var7 = var7 + var8;
                  var9_int = var9_int + var5;
                  continue L4;
                } else {
                  var9 = new StringBuilder(var7);
                  var10 = 0;
                  L5: while (true) {
                    var11 = param2.indexOf(param0, var10);
                    if ((var11 ^ -1) <= -1) {
                      StringBuilder discarded$21 = var9.append(param2.substring(var10, var11));
                      StringBuilder discarded$22 = var9.append(param1);
                      var10 = var11 - -var5;
                      continue L5;
                    } else {
                      StringBuilder discarded$23 = var9.append(param2.substring(var10));
                      return var9.toString();
                    }
                  }
                }
              }
            }
          } else {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
        }
    }

    ia() {
        ((ia) this).field_g = new byte[4096];
        ((ia) this).field_r = new boolean[16];
        ((ia) this).field_q = new byte[18002];
        ((ia) this).field_t = new int[6];
        ((ia) this).field_b = new int[16];
        ((ia) this).field_I = new int[6][258];
        ((ia) this).field_n = new int[6][258];
        ((ia) this).field_v = new int[256];
        ((ia) this).field_c = new byte[6][258];
        ((ia) this).field_f = new boolean[256];
        ((ia) this).field_H = 0;
        ((ia) this).field_k = new byte[256];
        ((ia) this).field_x = new int[257];
        ((ia) this).field_h = new int[6][258];
        ((ia) this).field_i = 0;
        ((ia) this).field_z = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Who can join";
    }
}
