/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends pi {
    static String[][] field_u;
    static int field_r;
    static String field_s;
    static int field_p;
    static String field_v;
    static String field_o;
    static int field_t;
    String field_n;
    static int field_q;

    final static db a(Throwable param0, String param1) {
        db var2_ref = null;
        db var2 = null;
        if (!(param0 instanceof db)) {
            var2 = new db(param0, param1);
        } else {
            var2_ref = (db) (Object) param0;
            var2_ref.field_a = var2_ref.field_a + 32 + param1;
        }
        return var2_ref;
    }

    public static void a(byte param0) {
        if (param0 > -23) {
            field_r = 91;
        }
        field_s = null;
        field_v = null;
        field_o = null;
        field_u = null;
    }

    lj(String param0) {
        ((lj) this).field_n = param0;
    }

    final static pb a(ld param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = MinerDisturbance.field_ab;
        var2 = param0.c((byte) -70, 8);
        if ((var2 ^ -1) < -1) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            if (param1 == -62) {
              break L0;
            } else {
              var9 = null;
              pb discarded$2 = lj.a((ld) null, (byte) 35);
              break L0;
            }
          }
          L1: {
            var3 = ql.a(param0, (byte) 100) ? 1 : 0;
            var4 = ql.a(param0, (byte) 100) ? 1 : 0;
            var5 = new pb();
            var5.field_y = (short)param0.c((byte) -71, 16);
            var5.field_n = gd.a(param0, 16, -125, var5.field_n);
            var5.field_M = gd.a(param0, 16, -87, var5.field_M);
            var5.field_Q = gd.a(param0, 16, -126, var5.field_Q);
            var5.field_I = (short)param0.c((byte) -81, 16);
            var5.field_e = gd.a(param0, 16, -95, var5.field_e);
            var5.field_O = gd.a(param0, 16, -74, var5.field_O);
            var5.field_F = gd.a(param0, 16, -78, var5.field_F);
            if (var3 != 0) {
              var5.field_g = (short)param0.c((byte) -105, 16);
              var5.field_C = gd.a(param0, 16, -100, var5.field_C);
              var5.field_q = gd.a(param0, 16, -83, var5.field_q);
              var5.field_B = gd.a(param0, 16, -128, var5.field_B);
              var5.field_f = gd.a(param0, 16, -57, var5.field_f);
              var5.field_w = gd.a(param0, 16, -118, var5.field_w);
              var5.field_d = gd.a(param0, 16, -55, var5.field_d);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              int discarded$3 = param0.c((byte) -67, 16);
              var5.field_s = gd.a(param0, 16, -66, var5.field_s);
              var5.field_u = gd.a(param0, 16, -62, var5.field_u);
              var5.field_i = gd.a(param0, 16, -84, var5.field_i);
              var5.field_a = gd.a(param0, 16, -70, var5.field_a);
              var5.field_P = gd.a(param0, 16, -69, var5.field_P);
              break L2;
            }
          }
          L3: {
            if (!ql.a(param0, (byte) 100)) {
              break L3;
            } else {
              var5.field_G = gd.a(param0, 16, -70, var5.field_G);
              break L3;
            }
          }
          L4: {
            if (!ql.a(param0, (byte) 100)) {
              break L4;
            } else {
              var5.field_x = sn.a(var5.field_x, param0, 16, -110);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_x.length) {
                  if (var6 != 0) {
                    var5.field_E = (byte)(var6 + 1);
                    break L4;
                  } else {
                    var5.field_x = null;
                    break L4;
                  }
                } else {
                  if (var6 < (var5.field_x[var7] & 255)) {
                    var6 = 255 & var5.field_x[var7];
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Some Miner";
        field_u = new String[][]{new String[1]};
        field_o = "Log in";
        field_v = "Dynamite: Explosives. Does not work underwater";
        field_q = -1;
    }
}
