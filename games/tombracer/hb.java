/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends coa {
    static dfa field_t;
    static int[] field_w;
    static char[] field_x;
    static String field_u;
    static String field_v;

    final static mi a(in param0, boolean param1) {
        int fieldTemp$5 = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        mi stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          fieldTemp$5 = param0.field_b - 1;
          param0.field_b = param0.field_b - 1;
          var2_int = fieldTemp$5;
          var3 = new StringBuilder();
          var4 = param0.b(21098);
          discarded$6 = var3.append((char) var4);
          var5 = param1 ? 1 : 0;
          while (!param0.a(0)) {
            var6 = param0.b(21098);
            if (var5 != 0) {
              discarded$7 = var3.append((char) var6);
              var5 = 0;
              continue;
            }
            if (var6 == 92) {
              var5 = 1;
            } else {
              discarded$8 = var3.append((char) var6);
            }
            if (var6 != var4) {
              continue;
            }
            break;
          }
          if (34 != var4) {
            stackIn_13_0 = nl.field_d;
          } else {
            stackIn_13_0 = ma.field_e;
          }
          var6Lifetime1 = stackIn_13_0;
          stackIn_14_0 = new mi(var6Lifetime1, var2_int, var3.toString());
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("hb.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public hb() {
    }

    public static void b(boolean param0) {
        field_w = null;
        field_v = null;
        field_u = null;
        field_t = null;
        if (param0) {
          field_x = null;
          return;
        }
        field_u = (String) null;
        field_x = null;
    }

    final int[][] b(int param0, int param1) {
        int var8 = 0;
        int var9 = 0;
        int var10 = TombRacer.field_G ? 1 : 0;
        int[][] var13 = this.field_h.a(param0, (byte) -2);
        int[][] var12 = var13;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (!this.field_h.field_f) {
          if (param1 != -1) {
            hb.d(113);
            return var3;
          }
          return var3;
        }
        if (!this.a(false)) {
          if (param1 != -1) {
            hb.d(113);
            return var3;
          }
          return var3;
        }
        var13 = var12;
        int[] var4 = var13[0];
        int[] var5 = var13[1];
        int[] var6 = var13[2];
        int var7 = this.field_r * (param0 % this.field_r);
        for (var8 = 0; ns.field_g > var8; var8++) {
          var9 = this.field_p[var8 % this.field_m + var7];
          var6[var8] = sea.c(4080, var9 << 4);
          var5[var8] = sea.c(var9, 65280) >> 4;
          var4[var8] = sea.c(4080, var9 >> 12);
        }
        if (param1 == -1) {
          return var3;
        }
        hb.d(113);
        return var3;
    }

    final static boolean d(int param0) {
        lqa var1 = uv.b(false);
        if (var1 != null) {
          int var2 = 74 % ((-14 - param0) / 45);
          return var1.field_d;
        }
        return false;
    }

    static {
        field_u = "Connection timed out. Please try using a different server.";
        field_x = new char[]{(char)91, (char)93, (char)35};
        field_v = "No Medal";
    }
}
