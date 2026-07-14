/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends da {
    static int[] field_w;
    static int field_z;
    int[][] field_l;
    static int[] field_m;
    boolean field_n;
    static int[][] field_j;
    long[][] field_t;
    static int[][][] field_u;
    static int field_x;
    static int[] field_s;
    String[][] field_i;
    static char[] field_p;
    static boolean field_C;
    static int field_k;
    static ka[] field_v;
    static int[] field_A;
    int field_r;
    int field_o;
    int field_q;
    static int[] field_y;

    final static void a(byte param0, String[] param1) {
        int var2 = 0;
        var2 = -91 % ((param0 - -22) / 50);
        if (null == ug.field_n) {
          if (m.field_j != null) {
            m.field_j.field_L.a(-6620, param1);
            return;
          } else {
            return;
          }
        } else {
          ug.field_n.field_L.a(-6620, param1);
          if (m.field_j == null) {
            return;
          } else {
            m.field_j.field_L.a(-6620, param1);
            return;
          }
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        if (param0 == 4) {
          if (bh.field_o != null) {
            L0: {
              bh.field_o.b();
              if (null != re.field_B) {
                re.field_B.b();
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (null != re.field_B) {
                re.field_B.b();
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          var2 = null;
          ae.a((byte) 91, (String[]) null);
          if (bh.field_o == null) {
            L2: {
              if (null != re.field_B) {
                re.field_B.b();
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              bh.field_o.b();
              if (null != re.field_B) {
                re.field_B.b();
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, bk param1, int param2) {
        int var4 = 0;
        pa var5 = null;
        var5 = dk.field_s;
        var5.d(25, param0);
        var5.field_q = var5.field_q + 1;
        var4 = var5.field_q;
        var5.d(1, (byte) 122);
        var5.d(param1.field_v, (byte) 122);
        if (param2 != -15024) {
          field_A = null;
          var5.c((byte) -89, param1.field_o);
          var5.a(param1.field_m, false);
          var5.a(param1.field_k, false);
          var5.a(param1.field_u, false);
          var5.a(param1.field_j, false);
          int discarded$2 = var5.b(var4, param2 + 29454);
          var5.a(var5.field_q - var4, -111);
          return;
        } else {
          var5.c((byte) -89, param1.field_o);
          var5.a(param1.field_m, false);
          var5.a(param1.field_k, false);
          var5.a(param1.field_u, false);
          var5.a(param1.field_j, false);
          int discarded$3 = var5.b(var4, param2 + 29454);
          var5.a(var5.field_q - var4, -111);
          return;
        }
    }

    public static void b(boolean param0) {
        field_v = null;
        field_A = null;
        field_s = null;
        field_y = null;
        field_j = null;
        field_u = null;
        field_w = null;
        field_m = null;
        if (!param0) {
          field_k = 83;
          field_p = null;
          return;
        } else {
          field_p = null;
          return;
        }
    }

    ae() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_w = new int[256];
        field_j = new int[][]{new int[2], new int[2]};
        field_s = new int[]{64, 96, 96, 64, 96, 64, 32, 96, 64, 32};
        field_p = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_C = false;
        field_m = new int[]{18, 22, 26};
        field_u = new int[][][]{new int[7][], new int[7][], new int[7][]};
        field_A = new int[]{64, 96, 96, 64, 64, 64, 32, 64, 64, 16};
        var1 = 0;
        L0: while (true) {
          if (-257 >= var1) {
            field_y = new int[4];
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_w[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (-2 != (1 & var0)) {
                  var0 = var0 >>> 1;
                  var2++;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> -1838264639;
                  var2++;
                  var2++;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
