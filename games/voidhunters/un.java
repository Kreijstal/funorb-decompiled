/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un extends us {
    static int[] field_h;

    final static void a(phb param0, int param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if ((3 & (param0.field_l | (param0.field_k | (param0.field_q | param0.field_p)))) == 0) {
            return;
          }
          var2_int = (param0.field_k & 3) + param0.field_q;
          var3 = (param0.field_l & 3) + param0.field_p;
          var2_int = var2_int + 4 - (3 & var2_int);
          var3 = -(3 & var3) + 4 + var3;
          var4 = new int[var3 * var2_int];
          var5 = 0;
          var6 = (3 & param0.field_k) + (param0.field_l & 3) * var2_int;
          if (param1 < 111) {
            field_h = (int[]) null;
          }
          for (var7 = 0; param0.field_p > var7; var7++) {
            for (var8 = 0; var8 < param0.field_q; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param0.field_r[incrementValue$1];
            }
            var6 = var6 + (var2_int - param0.field_q);
          }
          param0.field_r = var4;
          param0.field_l = param0.field_l & -4;
          param0.field_k = param0.field_k & -4;
          param0.field_q = var2_int;
          param0.field_p = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("un.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          phb var2 = (phb) null;
          un.a((phb) null, 3);
        }
        field_h = null;
    }

    final dka a(byte param0) {
        int var2 = -52 % ((param0 + 7) / 56);
        return cha.field_q;
    }

    un(long param0, String param1) {
        super(param0, param1);
    }

    static {
    }
}
