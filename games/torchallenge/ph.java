/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph implements j {
    private int field_n;
    private int field_c;
    static vk[] field_b;
    private int field_j;
    private eg field_l;
    private int field_i;
    static int field_d;
    private int field_g;
    private int field_k;
    static ka[] field_o;
    static int field_e;
    static String[] field_a;
    static ka[] field_h;
    static ka[] field_m;
    static String field_f;

    final static boolean a(byte param0) {
        if (param0 != -40) {
            return false;
        }
        return gi.field_d != null ? true : m.field_d;
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        bl var13 = null;
        ee stackIn_5_0 = null;
        ee stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        L0: {
          var11 = TorChallenge.field_F ? 1 : 0;
          if (param3 == 97) {
            break L0;
          } else {
            var12 = null;
            ((ph) this).a((ee) null, 19, 73, (byte) 52, true);
            break L0;
          }
        }
        L1: {
          if (param0 instanceof bl) {
            stackOut_4_0 = (ee) param0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = null;
            stackIn_5_0 = (ee) (Object) stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var13 = (bl) (Object) stackIn_5_0;
          qg.f(param2 - -param0.field_m, param1 + param0.field_i, param0.field_p, param0.field_l, ((ph) this).field_j);
          if (var13 == null) {
            break L2;
          } else {
            break L2;
          }
        }
        var7 = param0.field_p + -(2 * var13.field_W);
        var8 = param0.field_m + (param2 + var13.field_W);
        var9 = var13.field_Y + (param1 + param0.field_i);
        qg.d(var8, var9, var7 + var8, var9, ((ph) this).field_n);
        var10 = -1 + var13.d(true);
        L3: while (true) {
          if (-1 < (var10 ^ -1)) {
            L4: {
              if (((ph) this).field_l != null) {
                ((ph) this).field_l.a(var13.field_v, var7 / 2 + var8, ((ph) this).field_l.field_G + (var9 + var13.field_Y), ((ph) this).field_g, ((ph) this).field_i);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            qg.e(var8 - -(var7 * var13.a(-20, var10) / var13.a(-1)), var9, ((ph) this).field_k, ((ph) this).field_c);
            var10--;
            continue L3;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
            ph.a(115);
        }
        field_b = null;
        field_h = null;
        field_m = null;
        field_a = null;
        field_o = null;
        field_f = null;
    }

    ph(eg param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((ph) this).field_n = param3;
        ((ph) this).field_k = param5;
        ((ph) this).field_i = param2;
        ((ph) this).field_c = param6;
        ((ph) this).field_l = param0;
        ((ph) this).field_g = param1;
        ((ph) this).field_j = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_d = 0;
        field_b = new vk[255];
        field_f = "Quit to website";
        for (var0 = 0; var0 < field_b.length; var0++) {
            field_b[var0] = new vk();
        }
    }
}
