/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un extends us {
    static int[] field_h;

    final static void a(phb param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            if ((3 & (param0.field_l | (param0.field_k | (param0.field_q | param0.field_p)))) == 0) {
              return;
            } else {
              L1: {
                var2_int = (param0.field_k & 3) + param0.field_q;
                var3 = (param0.field_l & 3) + param0.field_p;
                var2_int = var2_int + 4 - (3 & var2_int);
                var3 = -(3 & var3) + 4 + var3;
                var4 = new int[var3 * var2_int];
                var5 = 0;
                var6 = (3 & param0.field_k) - -((param0.field_l & 3) * var2_int);
                if (param1 >= 111) {
                  break L1;
                } else {
                  field_h = null;
                  break L1;
                }
              }
              var7 = 0;
              L2: while (true) {
                if (param0.field_p <= var7) {
                  param0.field_r = var4;
                  param0.field_l = param0.field_l & -4;
                  param0.field_k = param0.field_k & -4;
                  param0.field_q = var2_int;
                  param0.field_p = var3;
                  break L0;
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= param0.field_q) {
                      var6 = var6 + (var2_int - param0.field_q);
                      var7++;
                      continue L2;
                    } else {
                      int incrementValue$2 = var6;
                      var6++;
                      int incrementValue$3 = var5;
                      var5++;
                      var4[incrementValue$2] = param0.field_r[incrementValue$3];
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("un.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
    }

    public static void a(boolean param0) {
        field_h = null;
    }

    final dka a(byte param0) {
        int var2 = -52 % ((param0 - -7) / 56);
        return cha.field_q;
    }

    un(long param0, String param1) {
        super(param0, param1);
    }

    static {
    }
}
