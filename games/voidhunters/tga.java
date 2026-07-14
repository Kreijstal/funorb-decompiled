/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tga extends uf implements lca {
    static boolean field_N;
    private eeb field_O;
    private int field_L;
    static String[] field_M;

    public static void j(int param0) {
        field_M = null;
        if (param0 <= 69) {
            tga.j(21);
        }
    }

    final void i(byte param0) {
        super.i(param0);
        if (((tga) this).field_O != null) {
            ((tga) this).field_O.a(99);
        }
    }

    final String d(byte param0) {
        if (((tga) this).field_e) {
          if (((tga) this).field_p != null) {
            if (param0 != 125) {
              field_M = null;
              tba.a(kc.field_b + (((tga) this).field_h + -((tga) this).field_L), (byte) -114, uia.field_b);
              return ((tga) this).field_p;
            } else {
              tba.a(kc.field_b + (((tga) this).field_h + -((tga) this).field_L), (byte) -114, uia.field_b);
              return ((tga) this).field_p;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, eeb param1) {
        if (param0 != 6614) {
            return;
        }
        ((tga) this).field_O = param1;
    }

    public final eeb a(int param0) {
        if (param0 != -782444220) {
            Object var3 = null;
            ((tga) this).a(64, (eeb) null);
            return ((tga) this).field_O;
        }
        return ((tga) this).field_O;
    }

    tga(String param0, sba param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a(int[] param0, int param1, byte param2, byte[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (param2 <= 66) {
          field_M = null;
          var5 = 0;
          L0: while (true) {
            if (bs.field_b.length <= var5) {
              return;
            } else {
              param1 = bs.field_b[var5];
              var6 = var5 << -782444220;
              L1: while (true) {
                param1--;
                if (param1 == 0) {
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  var6++;
                  param4 = aq.field_p[var6];
                  param0[param3[param4]] = param0[param3[param4]] + 1;
                  aq.field_p[param0[param3[param4]]] = param4;
                  continue L1;
                }
              }
            }
          }
        } else {
          var5 = 0;
          L2: while (true) {
            if (bs.field_b.length <= var5) {
              return;
            } else {
              param1 = bs.field_b[var5];
              var6 = var5 << -782444220;
              L3: while (true) {
                param1--;
                if (param1 == 0) {
                  var5++;
                  var5++;
                  continue L2;
                } else {
                  var6++;
                  param4 = aq.field_p[var6];
                  param0[param3[param4]] = param0[param3[param4]] + 1;
                  aq.field_p[param0[param3[param4]]] = param4;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        super.a(param0, param1, param2, param3);
        ((tga) this).field_L = -param1 + (kc.field_b - ((tga) this).field_g);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new String[]{"Simple", "Standard", "Advanced"};
        field_N = false;
    }
}
