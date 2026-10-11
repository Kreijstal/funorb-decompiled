/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static int[] field_f;
    static tf field_b;
    static int[] field_e;
    static int field_a;
    static int field_d;
    static int field_c;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = ub.a(param1, 0, "", (char)param2);
          var3 = bc.b(param2 ^ 95, param1);
          stackIn_5_0 = (param0.indexOf(param1) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("gb.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static hh[] a(byte param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        hh[] var1 = new hh[im.field_Qb];
        for (var2 = 0; var2 < im.field_Qb; var2++) {
          var1[var2] = new hh(tj.field_y, jb.field_a, fa.field_b[var2], e.field_b[var2], gf.field_g[var2], ge.field_c[var2], wo.field_f[var2], fl.field_g);
        }
        re.b(140);
        if (param0 != -96) {
          field_a = 112;
        }
        return var1;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
          field_e = (int[]) null;
        }
        field_b = null;
        field_e = null;
    }

    final static void a(byte param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param0 < 107) {
          field_d = -55;
        }
        if (null != hc.field_M) {
          var3 = hc.field_M.a((byte) 126, param1);
          if (var3 != -2) {
            if (var3 != -1) {
              var4 = hc.field_M.l(2) ? 1 : 0;
              cm.a(89, var4 != 0, hc.field_M.field_Ub, hc.field_M.k(123), var3, param2);
            }
            hc.field_M = null;
            jp.a(116);
          }
        }
    }

    static {
        field_e = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_d = -1;
        field_a = 4;
    }
}
