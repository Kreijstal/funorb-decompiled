/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static k field_g;
    static int[][] field_o;
    int field_b;
    private boolean field_i;
    int field_k;
    private long field_e;
    static fe[][] field_c;
    private String field_a;
    String field_n;
    static int[] field_f;
    private int field_h;
    int[] field_j;
    static int[][] field_d;
    static int[] field_l;
    int field_m;

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        field_l = null;
        field_o = null;
        field_d = null;
        field_c = null;
    }

    final static ka[] a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 <= 30) {
            return null;
        }
        return e.a(3, param2, 1, 1065, 1, 0, param3, param0, 1);
    }

    final int a(byte param0) {
        L0: {
          if (((bf) this).field_i) {
            break L0;
          } else {
            L1: {
              if (((bf) this).field_b != 2) {
                break L1;
              } else {
                if (0 < ((bf) this).field_h) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (jl.field_h == ((bf) this).field_e) {
              return 1;
            } else {
              if (param0 == -116) {
                if (2 != oj.field_f) {
                  return 0;
                } else {
                  if (ta.a(-93, ((bf) this).field_a)) {
                    return 1;
                  } else {
                    return 0;
                  }
                }
              } else {
                return -107;
              }
            }
          }
        }
        return 2;
    }

    final static void a(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TorChallenge.field_F ? 1 : 0;
          var4 = 7 % ((param2 - -45) / 32);
          if (0 != param1) {
            if (param1 != 1) {
              return;
            } else {
              var3 = nk.field_h;
              break L0;
            }
          } else {
            var3 = sh.field_r;
            break L0;
          }
        }
        L1: {
          if (var3 > param0 >> 3) {
            L2: {
              var5 = var3 % (param0 >> 3);
              if (0 != var5) {
                break L2;
              } else {
                var5 = param0 >> 3;
                break L2;
              }
            }
            L3: {
              var6 = var3 - var5;
              var7 = param0 + -(param0 >> 3 << 3);
              if (var7 >= param0 + -var6) {
                var6 = (7 * param0 >> 3) + -var5;
                break L3;
              } else {
                break L3;
              }
            }
            if (0 == param1) {
              vk.a(var6, (byte) 74);
              break L1;
            } else {
              if (param1 == 1) {
                nb.b(var6, -1);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            if (param1 != 0) {
              if (param1 == 1) {
                nb.b(0, -1);
                break L1;
              } else {
                break L1;
              }
            } else {
              vk.a(0, (byte) 81);
              break L1;
            }
          }
        }
    }

    bf(boolean param0) {
        ((bf) this).field_e = ik.field_b;
        ((bf) this).field_k = hc.field_O;
        ((bf) this).field_b = uk.field_L;
        ((bf) this).field_a = lk.field_b;
        if (!param0) {
            ((bf) this).field_j = null;
        } else {
            ((bf) this).field_j = eb.field_k;
        }
        ((bf) this).field_h = ih.field_K;
        ((bf) this).field_n = td.field_q;
        ((bf) this).field_i = o.field_m;
        ((bf) this).field_m = hf.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[][]{new int[2], new int[2]};
        field_c = new fe[3][9];
        field_f = new int[]{40, 60, 35};
        field_d = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_l = new int[4];
        field_g = new k(9, 0, 4, 1);
    }
}
