/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn implements ca {
    private se field_g;
    static int[] field_k;
    static int field_d;
    private int field_b;
    private int field_i;
    static boolean field_c;
    static gn field_l;
    private int field_f;
    private int field_m;
    static cn field_a;
    private int field_j;
    private int field_e;
    private int field_h;
    static lg field_n;

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        j var14 = param1 instanceof j ? (j) (param1) : null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        gf.b(param1.field_q + param2, param3 + param1.field_v, param1.field_x, param1.field_s, this.field_i);
        if (var14 != null) {
        }
        int var7 = param2 + param1.field_q + var14.field_I;
        int var8 = var14.field_R + param1.field_v + param3;
        gf.f(var7, var8, var14.field_M, this.field_h);
        if (param0 != 34) {
          return;
        }
        try {
          if (var14.field_P != -1) {
            var9 = 2.0 * ((double)var14.field_P * 3.141592653589793) / (double)var14.field_N;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_M);
            var12 = (int)(Math.cos(var9) * (double)var14.field_M);
            gf.f(var7 + var11, var8 + var12, 1, this.field_b);
          }
          gf.f(var7, var8, 2, 1);
          var9Lifetime1 = (double)var14.field_K * 3.141592653589793 * 2.0 / (double)var14.field_N;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_M);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_M);
          gf.c(var7, var8, var11Lifetime1 + var7, var12Lifetime1 + var8, 1);
          if (null != this.field_g) {
            var13 = this.field_e + var14.field_I + var14.field_M;
            this.field_g.a(param1.field_w, param1.field_q + param2 + var13, this.field_m + param1.field_v + param3, -this.field_e - var13 + param1.field_x, -(this.field_e << 1) + param1.field_s, this.field_f, this.field_j, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "jn.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String[] a(String param0, int[] param1, int param2, se param3) {
        int var6 = 0;
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        int var7 = 0;
        se var8 = null;
        String[] var9 = null;
        String[] var10 = null;
        String[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          if (wk.field_a == null) {
            wk.field_a = new String[16];
          }
          if (param2 > -59) {
            var8 = (se) null;
            jn.a((String) null, (int[]) null, -127, (se) null);
          }
          do {
            try {
              var4_int = param3.a(param0, param1, wk.field_a);
              decompiledRegionSelector0 = 0;
            } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
              if (wk.field_a.length >= 1024) {
                return null;
              }
              wk.field_a = new String[wk.field_a.length << 1];
              decompiledRegionSelector0 = 1;
            }
          } while (decompiledRegionSelector0 != 0);
          var9 = new String[var4_int];
          var10 = var9;
          var5 = var10;
          for (var6 = 0; var6 < var4_int; var6++) {
            var9[var6] = new String(wk.field_a[var6]);
          }
          ig.a(var10, (byte) -121);
          stackIn_15_0 = var5;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("jn.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_k = null;
        if (param0 != 1) {
          field_c = false;
        }
        field_l = null;
        field_a = null;
    }

    jn(se param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_f = param3;
          this.field_j = param4;
          this.field_e = param1;
          this.field_h = param5;
          this.field_m = param2;
          this.field_g = param0;
          this.field_b = param6;
          this.field_i = param7;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
    }
}
