/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ah {
    int field_l;
    int field_a;
    static int field_e;
    static int field_g;
    int field_i;
    int field_d;
    static String field_f;
    int field_j;
    static kf field_h;
    static boolean field_c;
    static int field_k;
    int field_b;

    final static void a(byte param0, pd param1, java.awt.Frame param2) {
        int var3 = 0;
        un var4 = null;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        var3 = -120 / ((param0 - -4) / 35);
        L0: while (true) {
          var4 = param1.a(param2, false);
          L1: while (true) {
            if (var4.field_a != -1) {
              if (-2 == var4.field_a) {
                param2.setVisible(false);
                param2.dispose();
                return;
              } else {
                mm.a(-18, 100L);
                continue L0;
              }
            } else {
              mm.a(-28, 10L);
              continue L1;
            }
          }
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -115) {
            return;
        }
        field_f = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        int var5 = param4 - -(df.field_e * param2);
        int var6 = var5 + param0;
        int var7 = (16711422 & param3) >> 1326752929;
        if (param1 != 100) {
            field_h = null;
        }
        for (var8 = var5; var8 < var6; var8++) {
            df.field_d[var8] = 0 != var8 % 2 ? param3 : var7;
        }
    }

    final static byte[] a(int param0, byte[] param1, hg param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        var4 = param2.c((byte) -78, param0);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param1 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param2.c((byte) -78, 3);
            var6 = (byte)param2.c((byte) -78, param3);
            if ((var5 ^ -1) < -1) {
              var7 = 0;
              L3: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param1[var7] = (byte)(param2.c((byte) -78, var5) + var6);
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
                  param1[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_f = "Asking to join <%0>'s game...";
    }
}
