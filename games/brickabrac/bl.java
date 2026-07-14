/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends af {
    static int[][] field_F;
    static String[] field_H;
    static tp field_J;
    static String field_G;
    static String field_I;
    static String field_K;

    final void d(int param0) {
        if (param0 > -60) {
            boolean discarded$0 = ((bl) this).a(-74, (byte) 4);
        }
        ((bl) this).a(mi.field_b, 0);
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        var3 = kf.a(param1, param2, 3);
        if (var3 != null) {
          return var3;
        } else {
          var4 = param0;
          L0: while (true) {
            if (var4 < param2.length()) {
              if (!mh.a(true, param2.charAt(var4))) {
                return cq.field_i;
              } else {
                var4++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    final boolean a(int param0, byte param1) {
        int stackIn_13_0 = 0;
        int stackOut_12_0;
        int stackOut_11_0;
        if (eo.a(((bl) this).field_t, param0, (byte) -75)) {
          return false;
        } else {
          if (param1 == 38) {
            L0: {
              L1: {
                if ((param0 ^ -1) == -23) {
                  break L1;
                } else {
                  if (26 == param0) {
                    break L1;
                  } else {
                    L2: {
                      if (lc.a(0, -93)) {
                        break L2;
                      } else {
                        if ((param0 ^ -1) == -17) {
                          break L1;
                        } else {
                          if ((param0 ^ -1) != -42) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  }
                }
              }
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L0;
            }
            return stackIn_13_0 != 0;
          } else {
            return false;
          }
        }
    }

    final static void f(int param0) {
        String var2 = null;
        if (param0 != 0) {
            return;
        }
        if (!(pk.field_g == null)) {
            var2 = pk.field_g;
            String var1 = var2;
            ag.a((byte) -83, rd.a(nf.field_T, new String[1], (byte) 103));
            pk.field_g = null;
        }
    }

    bl() {
        super(8, fr.field_l);
        ((bl) this).field_t = mk.field_b;
    }

    public static void h(byte param0) {
        field_G = null;
        field_J = null;
        field_H = null;
        field_K = null;
        field_F = null;
        int var1 = 121 / ((param0 - -59) / 32);
        field_I = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "You cannot join this game - it is in progress";
        field_I = "Advertising websites";
        field_G = "Please try changing the following settings:  ";
    }
}
