/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String[] field_b;
    int[] field_g;
    static cf field_a;
    int field_d;
    int field_e;
    static int[] field_h;
    static int[][] field_f;
    static t field_c;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (((qi) this).field_g != null) {
            // if_icmpeq L26
        } else {
            return 0;
        }
        for (var3 = 1; var3 < ((qi) this).field_g.length; var3++) {
            if (!(param1 >= ((qi) this).field_g[var3] + ((qi) this).field_g[-1 + var3] >> 287087041)) {
                return -1 + var3;
            }
        }
        if (param0 != 0) {
            return 118;
        }
        return -1 + ((qi) this).field_g.length;
    }

    final int b(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 87) {
            break L0;
          } else {
            qi.a(true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((qi) this).field_g == null) {
              break L2;
            } else {
              if (0 != ((qi) this).field_g.length) {
                stackOut_6_0 = ((qi) this).field_g[-1 + ((qi) this).field_g.length];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = vj.field_c;
        int var3 = param0 ? 1 : 0;
        if (!gh.field_x) {
            var1 = ea.field_e;
            if (!((ea.field_e + 1) % 2 != 0)) {
                return;
            }
            var3 = 1;
        }
        if (!(!gh.field_x)) {
            var1 = -12 + 2 * ea.field_e - -2 + -1;
            var3 = 1;
        }
        if (!(var3 == 0)) {
            ob.a(var2, var1, -7756);
        }
    }

    final static qj a(lj param0, String param1, lj param2, String param3, int param4) {
        int var5 = param2.a(param1, -89);
        if (param4 != 0) {
            Object var7 = null;
            qj discarded$0 = qi.a((lj) null, (String) null, (lj) null, (String) null, 9);
        }
        int var6 = param2.a(var5, param3, (byte) 123);
        return dg.a(var5, param2, var6, param0, (byte) 69);
    }

    public static void a(byte param0) {
        field_h = null;
        field_f = null;
        field_a = null;
        field_b = null;
        int var1 = 6 % ((35 - param0) / 33);
        field_c = null;
    }

    qi(int param0, int param1, int param2) {
        ((qi) this).field_d = param0;
        ((qi) this).field_g = new int[param2 - -1];
        ((qi) this).field_e = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new cf();
        field_h = new int[8192];
        field_c = null;
        field_f = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
    }
}
