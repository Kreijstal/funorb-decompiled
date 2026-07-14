/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends ik {
    static String field_m;
    static int[] field_l;
    static String field_j;
    static int field_h;
    private String field_i;
    int field_k;

    final void a(boolean param0, int param1, int param2) {
        il.a(((mh) this).field_c, param0, ((mh) this).field_d, ((mh) this).field_a, ((mh) this).field_b, false);
        int var4 = 0;
        if (!(param1 != 16777215)) {
            var4 = 1;
        }
        if (-16760897 == (param1 ^ -1)) {
            var4 = 2;
        }
        if (param2 != 1) {
            return;
        }
        gj.field_m.a(((mh) this).field_i, ((mh) this).field_k + ((mh) this).field_a, 17 + ((mh) this).field_d, var4, -1);
    }

    final static void a(byte param0, String param1, String param2) {
        if (param0 != 1) {
            mh.c(-13);
        }
        wk.a(param1, false, param2, false);
    }

    public static void c(int param0) {
        if (param0 >= -53) {
            field_h = 63;
        }
        field_j = null;
        field_m = null;
        field_l = null;
    }

    final static short[] a(byte param0, md param1, int param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        var4 = param1.d((byte) -114, param2);
        if (param0 == -2) {
          if (var4 != 0) {
            L0: {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (param3.length == var4) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              param3 = new short[var4];
              break L0;
            }
            L2: {
              var5 = param1.d((byte) -63, 4);
              var6 = (short)param1.d((byte) -94, 16);
              if (-1 <= (var5 ^ -1)) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param3[var7] = (short)var6;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param3[var7] = (short)(var6 + param1.d((byte) -51, var5));
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param3;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    mh(int param0, int param1, String param2, int param3) {
        ((mh) this).field_k = 9;
        ((mh) this).field_i = param2;
        ((mh) this).field_a = param0 + -9;
        ((mh) this).field_d = param1 + -4;
        ((mh) this).field_b = go.field_l.a(param2) + 20;
        ((mh) this).field_c = 26;
        if ((param3 ^ -1) == -2) {
            ((mh) this).field_a = ((mh) this).field_a - (-20 + ((mh) this).field_b);
        } else {
            if (param3 == 2) {
                ((mh) this).field_a = ((mh) this).field_a - (-10 + ((mh) this).field_b / 2);
            }
        }
    }

    mh(int param0, int param1, int param2, String param3, int param4) {
        ((mh) this).field_k = 9;
        ((mh) this).field_c = 26;
        ((mh) this).field_i = param3;
        ((mh) this).field_d = -4 + param1;
        ((mh) this).field_a = param0 - 9;
        ((mh) this).field_b = param2 - -20;
        if (param4 == 1) {
            ((mh) this).field_k = ((mh) this).field_k + (param2 + -go.field_l.a(param3));
        } else {
            if ((param4 ^ -1) == -3) {
                ((mh) this).field_k = ((mh) this).field_k + (-go.field_l.a(param3) + param2) / 2;
            }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -20) {
            Object var4 = null;
            short[] discarded$0 = mh.a((byte) -79, (md) null, 13, (short[]) null);
        }
        oa.field_b = param0;
        rn.field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Fullscreen mode";
        field_m = "Start Game";
    }
}
