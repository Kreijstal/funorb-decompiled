/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq {
    static String field_h;
    static String field_a;
    static String field_c;
    static String field_i;
    static String field_d;
    static tp[] field_b;
    static int field_g;
    static tg field_e;
    static jp field_f;

    public static void b(int param0) {
        field_i = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_h = null;
        field_a = null;
        if (param0 != -30593) {
          return;
        } else {
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0) {
        if (param0 != 4252) {
            return;
        }
        ng.field_b = 0;
        di.a((byte) -114);
    }

    final static nc a(byte param0, mf param1, wq param2, int param3, int param4, int param5, int param6) {
        int dupTemp$2 = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        wk var10 = null;
        int var11 = 0;
        nc var12 = null;
        nc var13 = null;
        nc stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var12 = new nc(param4, param6, param5);
            var13 = var12;
            dupTemp$2 = param2.i(65280);
            var13.field_i = dupTemp$2;
            var8 = dupTemp$2;
            var13.field_j = new byte[var8][];
            var13.field_c = new wk[var8];
            var9 = 0;
            L1: while (true) {
              if (var8 <= var9) {
                var9 = -74 % ((7 - param0) / 52);
                stackOut_4_0 = (nc) (var13);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var10 = ai.a((byte) -12, param2);
                var12.field_c[var10.field_n] = var10;
                var13.field_j[var10.field_n] = param1.a(var10.field_q, param3, 4);
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var7);
            stackOut_6_1 = new StringBuilder().append("mq.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0;
    }

    final static boolean a(byte param0) {
        int var1 = 25 % ((param0 - 55) / 54);
        return uo.a(uc.e((byte) -95), (byte) 14);
    }

    final static mh c(int param0) {
        if (param0 != 0) {
            return (mh) null;
        }
        return fo.field_b.field_Rb;
    }

    final static al a(byte param0, int param1) {
        al discarded$2 = null;
        al var2 = null;
        if (param0 <= 37) {
          discarded$2 = mq.a((byte) -67, -39);
          var2 = new al();
          ej.field_F.a(var2, (byte) 3);
          ma.b((byte) -112, param1);
          return var2;
        } else {
          var2 = new al();
          ej.field_F.a(var2, (byte) 3);
          ma.b((byte) -112, param1);
          return var2;
        }
    }

    static {
        field_h = "(<%0> players want to join)";
        field_a = "Please log in to access this feature.";
        field_i = "Tutorial";
        field_c = "Orb points: ";
        field_d = "End Game";
    }
}
