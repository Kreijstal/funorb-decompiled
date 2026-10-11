/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aka extends rqa {
    static boolean field_p;
    static int[] field_o;

    final static void a(pgb param0, int param1) {
        long stackIn_2_0;
        llb stackIn_2_1;
        int stackIn_2_2;
        Object stackIn_2_3;
        String stackIn_2_4;
        Object stackIn_2_5;
        String stackIn_2_6;
        int stackIn_2_7;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        hqb var5 = null;
        String var6 = null;
        hqb var7 = null;
        String var8 = null;
        hqb var9 = null;
        String var10 = null;
        hqb var11 = null;
        String var12 = null;
        hqb var13 = null;
        try {
          stackIn_2_0 = param0.field_i;
          stackIn_2_1 = param0.field_j;
          stackIn_2_2 = param0.field_a;
          stackIn_2_3 = null;
          stackIn_2_4 = param0.field_n;
          stackIn_2_5 = null;
          stackIn_2_6 = param0.field_e;
          stackIn_2_7 = 117;
          if (1 != param0.field_a) {
            stackIn_3_8 = 0;
          } else {
            stackIn_3_8 = param0.field_q;
          }
          pea.$cfr$intArgs$a$91f64d33677c(stackIn_2_0, stackIn_2_1, stackIn_2_2, (int[]) (stackIn_2_3), stackIn_2_4, (soa) (stackIn_2_5), stackIn_2_6, stackIn_2_7, stackIn_3_8);
          if (0 == param0.field_a &&
            !spb.a(-121) &&
            lqa.field_o == null &&
            ohb.field_o == null) {
            if (!hb.field_c) {
              var5 = cka.field_o;
              var6 = di.field_k;
              var5.field_i.a(var6, (byte) -53, 14);
            }
            var7 = cka.field_o;
            var8 = uca.field_D;
            var7.field_i.a(var8, (byte) -53, 20);
          }
          if (param0.field_a == 1 &&
            !spb.a(-78) &&
            null != lqa.field_o &&
            param0.field_q == lqa.field_o.f((byte) -13)) {
            if (!hb.field_c) {
              var9 = cka.field_o;
              var10 = kia.field_b;
              var9.field_i.a(var10, (byte) -53, 14);
            }
            var11 = cka.field_o;
            var12 = oqb.field_k;
            var11.field_i.a(var12, (byte) -53, 20);
          }
          if (param1 != 22859) {
            field_o = (int[]) null;
          }
          cka.field_o.a(true);
          cka.field_o.a(false, param1 ^ 22797);
          cka.field_o.a(-63, param0.field_a, param0.field_m);
          cka.field_o.b(-9923);
          cka.field_o.a(param0, param1 ^ 22805);
          var13 = cka.field_o;
          var3 = oq.field_H;
          var4 = qs.field_a;
          var13.field_i.b(var3, -29060, var4, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("aka.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    aka(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(boolean param0, int param1) {
        rga.a(param0, false, false);
        if (param1 > -121) {
          field_p = true;
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 >= -109) {
          aka.a(false, -67);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -119) {
            stackIn_4_0 = new nc(frb.a(86, 87));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("aka.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = true;
    }
}
