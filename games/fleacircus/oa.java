/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends lh {
    static String field_o;
    byte[] field_k;
    int field_i;
    static rh field_l;
    static int field_j;
    static int[] field_m;
    static boolean field_n;

    public static void a(byte param0) {
        field_l = null;
        if (param0 >= -67) {
            return;
        }
        field_m = null;
        field_o = null;
    }

    private oa() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        L0: {
          if (-8 != (param0 ^ -1)) {
            break L0;
          } else {
            if (qh.c((byte) 57)) {
              break L0;
            } else {
              if (0 >= wc.field_q) {
                break L0;
              } else {
                param0 = 0;
                break L0;
              }
            }
          }
        }
        if (bc.field_V == param0) {
          return;
        } else {
          pg.field_f = -60;
          bc.field_V = param0;
          af.field_g = 0;
          if (bc.field_V == 0) {
            L1: {
              bj.field_m = bc.field_V;
              k.a(0, td.field_j);
              if ((bc.field_V ^ -1) <= -1) {
                pi.field_b[bc.field_V].a(param1, true);
                break L1;
              } else {
                break L1;
              }
            }
            var3 = -72 % ((param2 - -26) / 39);
            if (-9 != (bc.field_V ^ -1)) {
              return;
            } else {
              vf.e(-6359);
              return;
            }
          } else {
            if (-2 != bc.field_V) {
              L2: {
                if ((bc.field_V ^ -1) <= -1) {
                  pi.field_b[bc.field_V].a(param1, true);
                  break L2;
                } else {
                  break L2;
                }
              }
              var3 = -72 % ((param2 - -26) / 39);
              if (-9 != (bc.field_V ^ -1)) {
                return;
              } else {
                vf.e(-6359);
                return;
              }
            } else {
              L3: {
                bj.field_m = bc.field_V;
                k.a(0, td.field_j);
                if ((bc.field_V ^ -1) <= -1) {
                  pi.field_b[bc.field_V].a(param1, true);
                  break L3;
                } else {
                  break L3;
                }
              }
              var3 = -72 % ((param2 - -26) / 39);
              if (-9 != (bc.field_V ^ -1)) {
                return;
              } else {
                vf.e(-6359);
                return;
              }
            }
          }
        }
    }

    final static ob a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = param0.length();
        var3 = 0;
        if (param1 > -5) {
          field_o = null;
          L0: while (true) {
            if (var2 > var3) {
              var4 = param0.charAt(var3);
              if (var4 >= 48) {
                if (57 >= var4) {
                  var3++;
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return je.field_M;
            }
          }
        } else {
          L1: while (true) {
            if (var2 > var3) {
              var4 = param0.charAt(var3);
              if (var4 >= 48) {
                if (57 >= var4) {
                  var3++;
                  var3++;
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return je.field_M;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = false;
        field_m = new int[5];
    }
}
