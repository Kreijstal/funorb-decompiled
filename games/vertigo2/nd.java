/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends c {
    static String field_l;
    static String field_j;
    static int field_k;

    public static void d(int param0) {
        field_l = null;
        if (param0 >= -15) {
          nd.d(-114);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final static void a(tn param0, int param1) {
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        b var5 = null;
        String var6 = null;
        b var7 = null;
        String var8 = null;
        b var9 = null;
        String var10 = null;
        b var11 = null;
        String var12 = null;
        b var13 = null;
        try {
          stackIn_2_0 = null;
          stackIn_2_1 = param0.field_s;
          stackIn_2_2 = param1 - 27730;
          if (param0.field_s != 1) {
            stackIn_3_3 = 0;
          } else {
            stackIn_3_3 = param0.field_q;
          }
          oq.a((od) (stackIn_2_0), stackIn_2_1, stackIn_2_2, stackIn_3_3, param0.field_l, (int[]) null, param0.field_e, param0.field_b, param0.field_a);
          if (param0.field_s == 0 &&
            !ja.a(param1 ^ -32193) &&
            gd.field_j == null &&
            sj.field_d == null) {
            if (!hj.field_b) {
              var5 = un.field_Lb;
              var6 = ck.field_K;
              var5.field_n.a(var6, 14, param1 ^ 32192);
            }
            var7 = un.field_Lb;
            var8 = ri.field_x;
            var7.field_n.a(var8, 20, 0);
          }
          if (param0.field_s == 1 &&
            !ja.a(-1) &&
            null != gd.field_j &&
            param0.field_q == gd.field_j.a((byte) -38)) {
            if (!hj.field_b) {
              var9 = un.field_Lb;
              var10 = up.field_D;
              var9.field_n.a(var10, 14, 0);
            }
            var11 = un.field_Lb;
            var12 = ja.field_g;
            var11.field_n.a(var12, 20, 0);
          }
          if (param1 != 32192) {
            return;
          }
          un.field_Lb.a(2);
          un.field_Lb.a(param1 - 32192, false);
          un.field_Lb.a(param0.field_f, param0.field_s, (byte) -50);
          un.field_Lb.c(-24634);
          un.field_Lb.a(true, param0);
          var13 = un.field_Lb;
          var3 = sd.field_N;
          var4 = no.field_e;
          var13.field_n.c(0, var4, -1220, var3, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("nd.I(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    nd(long param0, String param1) {
        super(param0, param1);
    }

    final tq a(byte param0) {
        if (param0 != -83) {
          field_k = 28;
          return hj.field_a;
        }
        return hj.field_a;
    }

    static {
        field_l = "This password is part of your Player Name, and would be easy to guess";
        field_j = "<%0> has joined your game.";
        field_k = 256;
    }
}
