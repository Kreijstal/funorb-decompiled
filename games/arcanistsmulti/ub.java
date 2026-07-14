/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static int field_a;
    static int[] field_i;
    static int field_b;
    static String field_f;
    static int field_h;
    static ll[] field_e;
    static int field_g;
    static String field_d;
    static kc field_c;

    final static byte[] a(int param0, ab param1, int param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = param1.d(28089, param2);
        if (0 != var4) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (var4 == param3.length) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param3 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param1.d(28089, param0);
            var6 = (byte)param1.d(param0 + 28086, 8);
            if (var5 <= 0) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param3[var7] = (byte)var6;
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param3[var7] = (byte)(var6 + param1.d(hh.a(param0, 28090), var5));
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
    }

    final static void a(int param0, boolean param1) {
        ab var2 = he.field_e;
        if (param1) {
            return;
        }
        var2.b((byte) -115, param0);
        var2.f(2, (byte) -128);
        var2.f(4, (byte) -43);
        var2.f(qn.k((byte) -14), (byte) -57);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 > -63) {
            ub.a(-21);
        }
        field_d = null;
        field_e = null;
        field_i = null;
        field_c = null;
    }

    final static void a(byte param0, int param1) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 109) {
            field_f = null;
        }
        cm var4 = (cm) (Object) cc.field_e.b(12623);
        while (var4 != null) {
            hb.a(var4, param1, (byte) 93);
            var4 = (cm) (Object) cc.field_e.a(0);
        }
        pg var2 = i.field_e.b(12623);
        while (var2 != null) {
            gb.a(param1, true);
            var2 = i.field_e.a(0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_i = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_a = 0;
        field_h = 3;
        field_f = "Only two targets left!";
        field_d = "Now, shoot the arrows as you shot the other spells, by holding the mouse button down to build up velocity and releasing to fire.";
    }
}
