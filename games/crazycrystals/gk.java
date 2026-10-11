/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk implements wo {
    private int field_f;
    private int field_b;
    static e field_e;
    static ko field_j;
    static dl[] field_d;
    private int field_i;
    private int field_l;
    private vc field_h;
    private int field_a;
    static String[] field_k;
    private int field_g;
    private int field_c;

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        pa var14 = null;
        qm stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (param3 instanceof pa) {
            stackIn_3_0 = (qm) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var14 = (pa) (stackIn_3_0);
          kh.f(param3.field_r + param2, param0 + param3.field_j, param3.field_g, param3.field_f, this.field_i);
          if (var14 == null) {
          }
          var7 = param3.field_r + param2 + var14.field_J;
          if (param1) {
            return;
          }
          var8 = param0 - (-param3.field_j - var14.field_K);
          kh.b(var7, var8, var14.field_I, this.field_f);
          if (var14.field_C != -1) {
            var9 = (double)var14.field_C * 3.141592653589793 * 2.0 / (double)var14.field_D;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
            var12 = (int)(Math.cos(var9) * (double)var14.field_I);
            kh.b(var11 + var7, var12 + var8, 1, this.field_b);
          }
          kh.b(var7, var8, 2, 1);
          var9Lifetime1 = (double)var14.field_B * 3.141592653589793 * 2.0 / (double)var14.field_D;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_I);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_I);
          kh.e(var7, var8, var11Lifetime1 + var7, var8 + var12Lifetime1, 1);
          if (this.field_h == null) {
            return;
          }
          var13 = this.field_g + var14.field_I + var14.field_J;
          this.field_h.a(param3.field_o, var13 + param2 + param3.field_r, param3.field_j + (param0 + this.field_a), param3.field_g - this.field_g - var13, -(this.field_g << 1) + param3.field_f, this.field_c, this.field_l, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("gk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_k = null;
        if (param0 <= -95) {
          field_j = null;
          field_d = null;
          return;
        }
        gk.a(-93);
        field_j = null;
        field_d = null;
    }

    gk(vc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_g = param1;
          this.field_f = param5;
          this.field_i = param7;
          this.field_h = param0;
          this.field_b = param6;
          this.field_a = param2;
          this.field_l = param4;
          this.field_c = param3;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_k = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
