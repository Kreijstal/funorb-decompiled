/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends ug {
    static int field_V;
    static nk[] field_bb;
    private String field_U;
    private boolean field_db;
    private int field_Y;
    static String field_cb;
    static volatile int field_G;
    private mi field_Z;
    private int field_ab;
    static int[] field_W;
    static int[] field_X;
    private int field_T;
    static String field_S;
    static int[] field_eb;
    static int[] field_R;

    final String e(int param0) {
        int var2 = ((hc) this).field_J.field_C ? 1 : 0;
        ((hc) this).field_J.field_C = ((hc) this).field_C;
        String var3 = ((hc) this).field_J.e(param0);
        ((hc) this).field_J.field_C = var2 != 0 ? true : false;
        return var3;
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
            hc.f((byte) -69);
        }
        ma.field_V = param0;
    }

    final static nn a(int param0, pn param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var8 = mn.a(22230, param3, param1, param5, param2, param4);
        java.awt.Frame var6 = var8;
        if (var8 == null) {
            return null;
        }
        nn var7 = new nn();
        var7.field_d = var8;
        java.awt.Component discarded$0 = var7.field_d.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, param0, param5, param3);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = ((hc) this).field_o - -param2;
        int var6 = param0 + ((hc) this).field_z;
        super.a(param0, (byte) -123, param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        if (param1 > -99) {
            hc.a(104, -35);
        }
        int var7 = ((hc) this).field_db ? -(((hc) this).field_ab * 2) + -((hc) this).field_T + ((hc) this).field_x : 0;
        int discarded$0 = ((hc) this).field_Z.a(((hc) this).field_U, var7 + (var5 + ((hc) this).field_ab), var6 - -((hc) this).field_ab, -((hc) this).field_ab + ((hc) this).field_T, -(((hc) this).field_ab * 2) + ((hc) this).field_E, ((hc) this).field_Y, -1, !((hc) this).field_db ? 2 : 0, 1, ((hc) this).field_Z.field_G);
    }

    hc(int param0, int param1, int param2, int param3, lh param4, boolean param5, int param6, int param7, mi param8, int param9, String param10) {
        super(param0, param1, param2, param3, (qk) null, (tn) null);
        ((hc) this).field_Z = param8;
        ((hc) this).field_T = param6;
        ((hc) this).field_J = param4;
        ((hc) this).field_ab = param7;
        ((hc) this).field_db = param5 ? true : false;
        ((hc) this).field_Y = param9;
        ((hc) this).field_U = param10;
        int var12 = ((hc) this).field_T + -((hc) this).field_ab;
        int var13 = ((hc) this).field_Z.a(param10, var12, ((hc) this).field_Z.field_G) + ((hc) this).field_ab * 2;
        if (param3 >= var13) {
            var13 = param3;
        } else {
            ((hc) this).a(param0, (byte) -110, param1, param2, var13);
        }
        int var14 = !((hc) this).field_db ? 2 * ((hc) this).field_ab + ((hc) this).field_T : 0;
        ((hc) this).field_J.a(var14, (byte) -84, ((hc) this).field_ab - -(var13 + -param3 >> -1223293183), -(3 * ((hc) this).field_ab) + (-((hc) this).field_T + param2), param3 + -(2 * ((hc) this).field_ab));
    }

    public static void f(byte param0) {
        field_eb = null;
        if (param0 < 1) {
            field_V = 37;
        }
        field_cb = null;
        field_S = null;
        field_R = null;
        field_X = null;
        field_bb = null;
        field_W = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_cb = "Configuration";
        field_V = 0;
        field_G = -1;
        field_S = "Try changing the following settings:  ";
        field_X = new int[250];
        field_eb = new int[32];
        field_W = new int[32];
        field_R = new int[32];
        var0 = 0;
        L0: while (true) {
          if ((var0 ^ -1) <= -33) {
            var0 = 0;
            L1: while (true) {
              if (-17 >= (var0 ^ -1)) {
                var0 = 0;
                L2: while (true) {
                  if ((var0 ^ -1) <= -33) {
                  } else {
                    field_X[var0] = 257 * var0;
                    field_X[-var0 + 63] = var0 * 257;
                    field_X[-(2 * var0) + 249] = 8224 + (-(var0 * 257) - -(65536 * (32 + -var0)));
                    field_X[249 + (-(2 * var0) + -1)] = (-var0 + 32) * 65536 + (8224 - var0 * 257);
                    var0++;
                    continue L2;
                  }
                }
              } else {
                field_W[16 + var0] = vn.a(field_W[16 + var0], var0 * 393216);
                field_eb[16 + var0] = vn.a(field_eb[16 + var0], 6 * var0);
                var0++;
                continue L1;
              }
            }
          } else {
            field_W[var0] = var0 * 771;
            field_eb[var0] = var0 * 197376;
            var0++;
            continue L0;
          }
        }
    }
}
