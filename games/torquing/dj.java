/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static int[] field_c;
    static t[] field_a;
    static String field_b;

    final static int a(int param0, int param1, int param2, rm param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int[] var11 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var20 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        var15 = Torquing.field_u;
        po.field_x[0] = param3.field_M[param7];
        po.field_x[1] = param3.field_M[param0];
        po.field_x[2] = param3.field_M[param1];
        cl.field_e[0] = param3.field_B[param7];
        cl.field_e[1] = param3.field_B[param0];
        cl.field_e[2] = param3.field_B[param1];
        jm.field_e[0] = param3.field_E[param7];
        jm.field_e[1] = param3.field_E[param0];
        jm.field_e[2] = param3.field_E[param1];
        ml.field_d[2] = param4;
        ml.field_d[1] = param2;
        ml.field_d[0] = param5;
        il.field_p[1] = param8;
        il.field_p[0] = param10;
        il.field_p[2] = param6;
        g.a(po.field_x, cl.field_e, jm.field_e, ml.field_d, il.field_p);
        cd.a(param3, -19729, 3);
        var26 = g.field_b;
        var23 = var26;
        var20 = var23;
        var17 = var20;
        var16 = var17;
        var11 = var16;
        var27 = g.field_c;
        var28 = g.field_a;
        param7 = param3.a(var26[0], var27[0], var28[0]);
        param0 = param3.a(var26[param9], var27[1], var28[1]);
        param1 = param3.a(var26[2], var27[2], var28[2]);
        var14 = 0;
        L0: while (true) {
          if (var14 >= param3.field_k) {
            param3.field_s[param3.field_k] = (byte) 0;
            param3.field_u[param3.field_k] = (short)param7;
            param3.field_n[param3.field_k] = (short)param0;
            param3.field_x[param3.field_k] = (short)param1;
            int fieldTemp$1 = param3.field_k;
            param3.field_k = param3.field_k + 1;
            return fieldTemp$1;
          } else {
            if (param7 == param3.field_u[var14]) {
              if (param0 == param3.field_n[var14]) {
                if (param3.field_x[var14] == param1) {
                  return var14;
                } else {
                  var14++;
                  continue L0;
                }
              } else {
                var14++;
                continue L0;
              }
            } else {
              var14++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -62) {
            field_c = null;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_b = "Passwords must be between 5 and 20 characters long";
    }
}
