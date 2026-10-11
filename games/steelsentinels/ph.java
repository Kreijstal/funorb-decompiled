/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String field_d;
    static String field_c;
    static String field_b;
    static String field_a;
    static String field_f;
    static na[] field_e;

    public static void a(int param0) {
        if (param0 < 33) {
          return;
        }
        field_e = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static void a(na param0, int param1) {
        gh stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        dd var6 = null;
        String var7 = null;
        dd var8 = null;
        String var9 = null;
        dd var10 = null;
        String var11 = null;
        dd var12 = null;
        String var13 = null;
        dd var14 = null;
        try {
          stackIn_2_0 = param0.field_m;
          if (param0.field_k != 1) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = param0.field_e;
          }
          kk.a(stackIn_2_0, stackIn_3_1, param0.field_k, (int[]) null, param0.field_p, param0.field_d, 1073741824, param0.field_j, (kg) null);
          if (~param0.field_k == param1 &&
            !kg.d((byte) 120) &&
            nf.field_b == null &&
            null == ni.field_a) {
            if (!uc.field_g) {
              var6 = an.field_i;
              var7 = ml.field_d;
              var6.field_j.a(2, 14, var7);
            }
            var8 = an.field_i;
            var9 = ei.field_u;
            var8.field_j.a(2, 20, var9);
          }
          if (param0.field_k == 1 &&
            !kg.d((byte) 37) &&
            nf.field_b != null &&
            param0.field_e == nf.field_b.j(-120)) {
            if (!uc.field_g) {
              var10 = an.field_i;
              var11 = qi.field_g;
              var10.field_j.a(param1 + 3, 14, var11);
            }
            var12 = an.field_i;
            var13 = bl.field_g;
            var12.field_j.a(2, 20, var13);
          }
          an.field_i.a((byte) 64);
          an.field_i.a(false, (byte) -79);
          an.field_i.a(param0.field_l, -2, param0.field_k);
          an.field_i.c(-99);
          an.field_i.a(0, param0);
          var14 = an.field_i;
          var3 = oa.field_S;
          var4 = rj.field_j;
          var14.field_j.a(0, 0, var4, (byte) -97, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ph.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != 12412) {
          field_f = (String) null;
          if (ve.field_a == null) {
            return false;
          }
          if (ve.field_a.a((byte) -60)) {
            return true;
          }
          return false;
        }
        if (ve.field_a == null) {
          return false;
        }
        if (ve.field_a.a((byte) -60)) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        km.field_i = param0;
        if (param3 >= -62) {
          return;
        }
        se.field_e = param1;
        kj.field_I = param2;
    }

    static {
        field_c = "Please try again in a few minutes.";
        field_a = "Players: ";
        field_b = "Open in popup window";
        field_f = "Try changing the '<%0>' setting.";
        field_d = "TOTAL: <img=24><col=<%1>><%0></col>";
    }
}
