/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qea extends rqa {
    static int[] field_r;
    static int field_p;
    static int field_q;
    static int field_o;

    qea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          qea.a((byte) -45, -12);
          si.a(74, 62, param0[0].a(118));
          return new nc((Object) (Object) "void");
        } else {
          si.a(74, 62, param0[0].a(118));
          return new nc((Object) (Object) "void");
        }
    }

    public static void b(boolean param0) {
        field_r = null;
        if (!param0) {
            qea.a(-19, -41, true, 117, -123, 114, 51);
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (param0 == -29) {
          hqb.a(0, pn.field_b, bea.field_e, true, param1, (byte) 24, rha.field_d);
          var2 = 0;
          L0: while (true) {
            if (bea.field_e <= var2) {
              L1: {
                hqb.a(param1, qbb.field_a, bea.field_e + param1, false, param1 + param1, (byte) 24, npa.field_d);
                if (bea.field_e > param1) {
                  bea.field_e = param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              sv.field_f[var2 - -param1] = var2;
              var2++;
              continue L0;
            }
          }
        } else {
          field_r = null;
          hqb.a(0, pn.field_b, bea.field_e, true, param1, (byte) 24, rha.field_d);
          var2 = 0;
          L2: while (true) {
            if (bea.field_e <= var2) {
              L3: {
                hqb.a(param1, qbb.field_a, bea.field_e + param1, false, param1 + param1, (byte) 24, npa.field_d);
                if (bea.field_e > param1) {
                  bea.field_e = param1;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              sv.field_f[var2 - -param1] = var2;
              var2++;
              continue L2;
            }
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        String var7 = null;
        int var8 = 105 / ((27 - param1) / 52);
        if ((ow.field_b ^ -1) == -3) {
            var7 = iqa.field_o;
        } else {
            var7 = kia.field_b;
        }
        VoidHunters.a(param4, param3, param6, param0, var7, param5, true, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[16];
        field_q = 100;
        field_o = 0;
    }
}
