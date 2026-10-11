/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn implements el {
    private uc field_c;
    static byte field_e;
    private int field_k;
    private int field_h;
    static String field_a;
    static int field_j;
    private int field_i;
    private int field_g;
    static volatile int field_b;
    private int field_l;
    private int field_d;
    static volatile int field_f;

    public static void a(byte param0) {
        if (param0 < 104) {
          rn.a(43);
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        int var10 = 0;
        gm stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        ri var12 = null;
        var11 = Torquing.field_u;
        try {
          if (!(param4 instanceof ri)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (gm) (param4);
          }
          var12 = (ri) (stackIn_4_0);
          ph.d(param2 + param4.field_w, param1 + param4.field_k, param4.field_p, param4.field_o, this.field_i);
          if (var12 != null) {
          }
          if (param0 < 89) {
            return;
          }
          var7 = -(2 * var12.field_F) + param4.field_p;
          var8 = param4.field_w + param2 + var12.field_F;
          var9 = var12.field_C + (param1 + param4.field_k);
          ph.a(var8, var9, var7 + var8, var9, this.field_g);
          for (var10 = var12.a(0) - 1; 0 <= var10; var10--) {
            ph.d(var8 + var7 * var12.b(var10, 0) / var12.a((byte) -108), var9, this.field_k, this.field_h);
          }
          if (this.field_c == null) {
            return;
          }
          this.field_c.c(var12.field_m, var7 / 2 + var8, var12.field_C + var9 + this.field_c.field_q, this.field_l, this.field_d);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("rn.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3 = param0 >> 16;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param1 == -18) {
          var4 = param0 & 65535;
          var5 = param2 >> 16;
          var6 = param2 & 65535;
          return var4 * var5 + (var3 * param2 + (var4 * var6 >> 16));
        }
        field_b = 126;
        var4Lifetime1 = param0 & 65535;
        var5Lifetime1 = param2 >> 16;
        var6Lifetime1 = param2 & 65535;
        return var4Lifetime1 * var5Lifetime1 + (var3 * param2 + (var4Lifetime1 * var6Lifetime1 >> 16));
    }

    rn(uc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_g = param3;
          this.field_l = param1;
          this.field_d = param2;
          this.field_h = param6;
          this.field_c = param0;
          this.field_k = param5;
          this.field_i = param4;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int param0) {
        oh.field_c = 0;
        if (param0 > -3) {
          field_j = 64;
        }
    }

    static {
        field_j = 0;
        field_e = (byte) 1;
        field_a = "EXCLUSIVE";
        field_f = 0;
        field_b = -1;
    }
}
