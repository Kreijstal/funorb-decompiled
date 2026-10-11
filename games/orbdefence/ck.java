/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck implements td {
    private int field_a;
    private int field_i;
    static String[] field_h;
    static qg[] field_n;
    private int field_l;
    static kc field_g;
    static String field_k;
    static int field_f;
    static long field_e;
    private int field_b;
    private int field_o;
    static rf field_j;
    private int field_d;
    static hj[] field_c;
    private kc field_m;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        int var10 = 0;
        pj stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        ue var12 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          if (!(param2 instanceof ue)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (pj) (param2);
          }
          var12 = (ue) (stackIn_4_0);
          if (var12 != null) {
          }
          ul.h(param2.field_s + param1, param2.field_n + param0, param2.field_m, param2.field_r, this.field_o);
          var7 = -(var12.field_I * 2) + param2.field_m;
          var8 = param2.field_s + param1 + var12.field_I;
          if (param3 != -4394) {
            field_j = (rf) null;
          }
          var9 = param2.field_n + (param0 + var12.field_L);
          ul.b(var8, var9, var7 + var8, var9, this.field_d);
          for (var10 = -1 + var12.a((byte) -90); var10 >= 0; var10--) {
            ul.f(var8 + var7 * var12.a(-1, var10) / var12.j(1), var9, this.field_b, this.field_a);
          }
          if (null == this.field_m) {
            return;
          }
          this.field_m.c(var12.field_l, var7 / 2 + var8, var12.field_L + this.field_m.field_z + var9, this.field_l, this.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_j = null;
        field_n = null;
        if (param0 == 22499) {
          field_k = null;
          field_h = null;
          field_c = null;
          return;
        }
        field_j = (rf) null;
        field_k = null;
        field_h = null;
        field_c = null;
    }

    ck(kc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_i = param2;
          this.field_o = param4;
          this.field_l = param1;
          this.field_d = param3;
          this.field_a = param6;
          this.field_m = param0;
          this.field_b = param5;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_f = 256;
        field_k = ",";
    }
}
