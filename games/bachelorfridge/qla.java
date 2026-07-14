/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qla extends kj {
    static kv[] field_g;
    static int field_f;
    private int field_i;
    private int field_h;

    final static sna a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, po param7, int param8, int param9, int param10, int param11, int param12) {
        sna var13 = null;
        var13 = new sna(0L, (sna) null);
        var13.field_eb = sma.a((byte) -85, param12, param0);
        var13.field_A = sma.a((byte) 119, param1, param5);
        var13.field_db = sma.a((byte) -38, param3, param9);
        var13.field_K = sma.a((byte) -115, param8, param10);
        var13.field_X = sma.a((byte) 73, param4, param11);
        var13.field_jb = param7;
        var13.field_gb = param2;
        if (param6 != -24) {
          field_f = -88;
          return var13;
        } else {
          return var13;
        }
    }

    final boolean b(int param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 21) {
          var3 = null;
          sna discarded$2 = qla.a(96, -29, 54, -43, 95, 72, 56, (po) null, -23, -63, 97, 106, -33);
          ((qla) this).field_i = ((qla) this).field_i + 1;
          if ((((qla) this).field_i + 1 ^ -1) > -65) {
            return false;
          } else {
            return true;
          }
        } else {
          L0: {
            ((qla) this).field_i = ((qla) this).field_i + 1;
            if ((((qla) this).field_i + 1 ^ -1) <= -65) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    qla(gj param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        ((qla) this).field_h = param3;
    }

    final void a(int param0, boolean param1, int param2) {
        am.field_M[((qla) this).field_h].c(-24 + (param2 - -64), -((qla) this).field_i + -24 + param0 + -32, am.field_M[((qla) this).field_h].field_q << -1875116991, am.field_M[((qla) this).field_h].field_p << -1972427935, 256 - (((qla) this).field_i << 844622914));
        if (!param1) {
            ((qla) this).a(43, 82, 108);
        }
    }

    final static void d(int param0) {
        eaa.f(31883);
        nm.f(-21522);
        uc.b(-103);
        if (param0 != -64) {
            field_g = null;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            ((qla) this).a(-97, false, -128);
        }
    }

    public static void c(int param0) {
        if (param0 != -24) {
            field_f = -125;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static boolean a(byte param0, lu param1) {
        int var2 = param1.b(16711935);
        int var3 = var2 != 1 ? 0 : 1;
        if (param0 <= 79) {
            return true;
        }
        return var3 != 0;
    }

    static {
    }
}
