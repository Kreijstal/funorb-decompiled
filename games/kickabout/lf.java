/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static String field_c;
    static String field_b;
    private int[] field_a;

    final static int a(byte param0, int param1) {
        if (param0 > -55) {
            return 67;
        }
        if (!(!ia.field_c)) {
            param1 = -param1 + 1344;
        }
        return go.a(param1, (byte) -56);
    }

    final static boolean a(String param0, int param1) {
        int var2 = 82 / ((54 - param1) / 32);
        return null != tr.a(param0, (byte) 40) ? true : false;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 94) {
            int discarded$0 = lf.a((byte) -22, 76);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        nb.field_i = qa.h(-117);
        wd.field_l = new se();
        if (param0 >= -59) {
          lf.a(-98);
          bl.a(true, true, (byte) -72);
          return;
        } else {
          bl.a(true, true, (byte) -72);
          return;
        }
    }

    lf(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 1;
        L0: while (true) {
          if (param0.length - -(param0.length >> -1958199871) < var2) {
            ((lf) this).field_a = new int[var2 + var2];
            var3 = 0;
            L1: while (true) {
              if (var2 + var2 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (param0.length > var3) {
                    var4 = param0[var3] & var2 + -1;
                    L3: while (true) {
                      if ((((lf) this).field_a[1 + (var4 - -var4)] ^ -1) == 0) {
                        ((lf) this).field_a[var4 - -var4] = param0[var3];
                        ((lf) this).field_a[1 + var4 + var4] = var3;
                        var3++;
                        continue L2;
                      } else {
                        var4 = -1 + var2 & var4 - -1;
                        continue L3;
                      }
                    }
                  } else {
                  }
                }
              } else {
                ((lf) this).field_a[var3] = -1;
                var3++;
                continue L1;
              }
            }
          } else {
            var2 = var2 << 1;
            continue L0;
          }
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        var3 = -1 + (((lf) this).field_a.length >> 1325328769);
        if (param1 < -37) {
          var4 = param0 & var3;
          L0: while (true) {
            var5 = ((lf) this).field_a[var4 + (var4 + 1)];
            if (-1 != var5) {
              if (param0 == ((lf) this).field_a[var4 + var4]) {
                return var5;
              } else {
                var4 = var4 + 1 & var3;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          lf.a(-22);
          var4 = param0 & var3;
          L1: while (true) {
            var5 = ((lf) this).field_a[var4 + (var4 + 1)];
            if (-1 != var5) {
              if (param0 == ((lf) this).field_a[var4 + var4]) {
                return var5;
              } else {
                var4 = var4 + 1 & var3;
                continue L1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    static {
    }
}
