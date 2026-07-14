/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends gi {
    static nh field_q;
    static boolean field_k;
    static bb field_n;
    int field_m;
    static he[] field_l;
    static int[][] field_o;
    static int field_r;
    static nh field_p;
    static String field_j;
    int field_h;
    static nh[] field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param7 != 28183) {
          field_l = null;
          if (param5 >= param3) {
            if (param5 >= param4) {
              if (param4 <= param3) {
                fa.a(param4, (byte) -124, param2, param5, param0, param3, param6, param1, wj.field_l);
                return;
              } else {
                fa.a(param3, (byte) -124, param6, param5, param0, param4, param2, param1, wj.field_l);
                return;
              }
            } else {
              fa.a(param3, (byte) -124, param1, param4, param0, param5, param2, param6, wj.field_l);
              return;
            }
          } else {
            if (param4 <= param3) {
              if (param4 > param5) {
                fa.a(param5, (byte) -124, param6, param3, param0, param4, param1, param2, wj.field_l);
                return;
              } else {
                fa.a(param4, (byte) -124, param1, param3, param0, param5, param6, param2, wj.field_l);
                return;
              }
            } else {
              fa.a(param5, (byte) -124, param2, param4, param0, param3, param1, param6, wj.field_l);
              return;
            }
          }
        } else {
          if (param5 >= param3) {
            if (param5 >= param4) {
              if (param4 <= param3) {
                fa.a(param4, (byte) -124, param2, param5, param0, param3, param6, param1, wj.field_l);
                return;
              } else {
                fa.a(param3, (byte) -124, param6, param5, param0, param4, param2, param1, wj.field_l);
                return;
              }
            } else {
              fa.a(param3, (byte) -124, param1, param4, param0, param5, param2, param6, wj.field_l);
              return;
            }
          } else {
            if (param4 <= param3) {
              if (param4 > param5) {
                fa.a(param5, (byte) -124, param6, param3, param0, param4, param1, param2, wj.field_l);
                return;
              } else {
                fa.a(param4, (byte) -124, param1, param3, param0, param5, param6, param2, wj.field_l);
                return;
              }
            } else {
              fa.a(param5, (byte) -124, param2, param4, param0, param3, param1, param6, wj.field_l);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_q = null;
        field_j = null;
        field_o = null;
        field_l = null;
        field_i = null;
        field_n = null;
        if (param0 != -1) {
          kc.a(100, 93, 101, 72, -52, -125, 28, -79);
          field_p = null;
          return;
        } else {
          field_p = null;
          return;
        }
    }

    final static jb a(vj param0, vj param1, String param2, int param3, String param4) {
        int var5 = param1.a(param2, (byte) -114);
        int var6 = -24 % ((param3 - -39) / 54);
        int var7 = param1.a((byte) -105, param4, var5);
        return oj.a(var5, var7, param1, param0, 15619);
    }

    private kc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_n = new bb();
        field_o = new int[][]{new int[8], new int[1], new int[1], new int[3], new int[1], new int[1], new int[3], new int[1], new int[1]};
        field_j = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
